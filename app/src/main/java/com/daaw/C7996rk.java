package com.daaw;

import com.daaw.C4999h10;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7996rk {
    public static final Logger f = Logger.getLogger(AbstractC6323lk.class.getName());
    public final Object a = new Object();
    public final C6404m10 b;
    public final Collection c;
    public final long d;
    public int e;

    /* JADX INFO: renamed from: com.daaw.rk$a */
    public class a extends ArrayDeque {
        public final /* synthetic */ int B;

        public a(int i) {
            this.B = i;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(C4999h10 c4999h10) {
            if (size() == this.B) {
                removeFirst();
            }
            C7996rk.a(C7996rk.this);
            return super.add(c4999h10);
        }
    }

    /* JADX INFO: renamed from: com.daaw.rk$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4999h10.b.values().length];
            a = iArr;
            try {
                iArr[C4999h10.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4999h10.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C7996rk(C6404m10 c6404m10, int i, long j, String str) {
        AbstractC7785qy0.o(str, "description");
        this.b = (C6404m10) AbstractC7785qy0.o(c6404m10, "logId");
        if (i > 0) {
            this.c = new a(i);
        } else {
            this.c = null;
        }
        this.d = j;
        e(new C4999h10.a().b(str + " created").c(C4999h10.b.CT_INFO).e(j).a());
    }

    public static /* synthetic */ int a(C7996rk c7996rk) {
        int i = c7996rk.e;
        c7996rk.e = i + 1;
        return i;
    }

    public static void d(C6404m10 c6404m10, Level level, String str) {
        Logger logger = f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c6404m10 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public C6404m10 b() {
        return this.b;
    }

    public boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.c != null;
        }
        return z;
    }

    public void e(C4999h10 c4999h10) {
        int i = b.a[c4999h10.b.ordinal()];
        Level level = i != 1 ? i != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(c4999h10);
        d(this.b, level, c4999h10.a);
    }

    public void f(C4999h10 c4999h10) {
        synchronized (this.a) {
            try {
                Collection collection = this.c;
                if (collection != null) {
                    collection.add(c4999h10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
