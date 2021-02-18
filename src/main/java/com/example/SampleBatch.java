package com.example;

import com.example.form.ZipCodeForm;
import com.example.interceptor.ValidateData;
import com.example.reader.ZipCodeFileReader;
import nablarch.core.log.Logger;
import nablarch.core.log.LoggerManager;
import nablarch.fw.DataReader;
import nablarch.fw.ExecutionContext;
import nablarch.fw.Result;
import nablarch.fw.action.BatchAction;

public class SampleBatch extends BatchAction<ZipCodeForm> {

    /**
     * ロガー。
     */
    private static final Logger LOGGER = LoggerManager.get(SampleBatch.class);

    @Override
    @ValidateData
    public Result handle(ZipCodeForm inputData, ExecutionContext ctx) {

        LOGGER.logInfo("行番号   : " + inputData.getLineNumber());
        LOGGER.logInfo("郵便番号 : " + inputData.getZipCode7digit());
        
        return new Result.Success();
    }

    /**
     * リーダを作成する。
     * @param ctx 実行コンテキスト
     * @return リーダーオブジェクト
     */
    @Override
    public DataReader<ZipCodeForm> createReader(ExecutionContext ctx) {
        return new ZipCodeFileReader();
    }
}
