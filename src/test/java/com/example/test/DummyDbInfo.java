package com.example.test;

import nablarch.test.core.db.DbInfo;

public class DummyDbInfo implements DbInfo {
    @Override
    public String[] getPrimaryKeys(String tabName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String[] getColumns(String tabName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getColumnType(String tabName, String columnName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isUniqueIndex(String tabName, String colName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getColumnLength(String tabName, String colName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isComputedColumn(String tabName, String colName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isNumberTypeColumn(String tableName, String columnName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDateTypeColumn(String tableName, String columnName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isBinaryTypeColumn(String tableName, String columnName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isBooleanTypeColumn(String tableName, String columnName) {
        throw new UnsupportedOperationException();
    }
}
