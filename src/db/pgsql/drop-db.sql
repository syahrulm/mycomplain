DO $$
BEGIN
    IF EXISTS (SELECT datname FROM pg_database WHERE datname = 'mycomplain')
    THEN
        PERFORM pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'mycomplain';
    END IF;
END $$;

