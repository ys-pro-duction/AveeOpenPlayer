package com.daaw;

import j$.util.Objects;
import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.daaw.i31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5289i31 {
    public String a = null;
    public Boolean b = null;
    public Integer c = null;
    public Thread.UncaughtExceptionHandler d = null;
    public ThreadFactory e = null;

    /* JADX INFO: renamed from: com.daaw.i31$a */
    public class a implements ThreadFactory {
        public final /* synthetic */ ThreadFactory B;
        public final /* synthetic */ String C;
        public final /* synthetic */ AtomicLong D;
        public final /* synthetic */ Boolean E;
        public final /* synthetic */ Integer F;
        public final /* synthetic */ Thread.UncaughtExceptionHandler G;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.B = threadFactory;
            this.C = str;
            this.D = atomicLong;
            this.E = bool;
            this.F = num;
            this.G = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.B.newThread(runnable);
            String str = this.C;
            if (str != null) {
                AtomicLong atomicLong = this.D;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(C5289i31.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.E;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.F;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.G;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static ThreadFactory c(C5289i31 c5289i31) {
        String str = c5289i31.a;
        Boolean bool = c5289i31.b;
        Integer num = c5289i31.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c5289i31.d;
        ThreadFactory threadFactoryDefaultThreadFactory = c5289i31.e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public C5289i31 e(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public C5289i31 f(String str) {
        d(str, 0);
        this.a = str;
        return this;
    }
}
