package com.xsoft.dianliangpin.beans;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

public class TimeBody extends ResponseBody {
    @Override
    public MediaType contentType() {
        return null;
    }

    @Override
    public long contentLength() {
        return 0;
    }

    @Override
    public BufferedSource source() {
        return null;
    }
}
