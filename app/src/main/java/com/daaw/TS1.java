package com.daaw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TS1 {
    public static final ThreadPoolExecutor a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new SS1("ClientDefault"));
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new SS1("ClientSingle"));
}
