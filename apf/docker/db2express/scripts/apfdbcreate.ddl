REATE DATABASE APFDB
COLLATE USING SYSTEM PAGESIZE 2048;

UPDATE DB CFG FOR APFDB USING AUTO_MAINT ON;
UPDATE DB CFG FOR APFDB USING AUTO_TBL_MAINT ON;
UPDATE DB CFG FOR APFDB USING AUTO_RUNSTATS ON;
UPDATE DB CFG FOR APFDB USING logprimary 32 logsecond 6 logfilsiz 1024;
UPDATE ALERT CFG FOR DATABASE ON APFDB USING db.db_backup_req SET THRESHOLDSCHECKED YES;
UPDATE ALERT CFG FOR DATABASE ON APFDB USING db.tb_reorg_req SET THRESHOLDSCHECKED YES;
UPDATE ALERT CFG FOR DATABASE ON APFDB USING db.tb_runstats_req SET THRESHOLDSCHECKED YES;