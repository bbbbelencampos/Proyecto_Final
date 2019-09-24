-- Create a new database called 'bibliAnimna'

-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = N'bibliAnimna'
)
CREATE DATABASE bibliAnimna;

USE bibliAnimna;

CREATE 