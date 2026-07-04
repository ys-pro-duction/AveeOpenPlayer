package com.daaw;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Np0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1716Np0 {
    public final Logger a;
    public final Level b;

    /* JADX INFO: renamed from: com.daaw.Np0$a */
    public enum a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: renamed from: com.daaw.Np0$b */
    public enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);

        public final int B;

        b(int i) {
            this.B = i;
        }

        public int a() {
            return this.B;
        }
    }

    public C1716Np0(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    public static String l(C4057dh c4057dh) {
        if (c4057dh.f1() <= 64) {
            return c4057dh.g1().l();
        }
        return c4057dh.h1((int) Math.min(c4057dh.f1(), 64L)).l() + "...";
    }

    public static String m(CQ0 cq0) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (cq0.d(bVar.a())) {
                enumMap.put(bVar, Integer.valueOf(cq0.a(bVar.a())));
            }
        }
        return enumMap.toString();
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }

    public void b(a aVar, int i, C4057dh c4057dh, int i2, boolean z) {
        if (a()) {
            this.a.log(this.b, aVar + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + l(c4057dh));
        }
    }

    public void c(a aVar, int i, EnumC7034oH enumC7034oH, C4908gi c4908gi) {
        if (a()) {
            this.a.log(this.b, aVar + " GO_AWAY: lastStreamId=" + i + " errorCode=" + enumC7034oH + " length=" + c4908gi.s() + " bytes=" + l(new C4057dh().j1(c4908gi)));
        }
    }

    public void d(a aVar, int i, List list, boolean z) {
        if (a()) {
            this.a.log(this.b, aVar + " HEADERS: streamId=" + i + " headers=" + list + " endStream=" + z);
        }
    }

    public void e(a aVar, long j) {
        if (a()) {
            this.a.log(this.b, aVar + " PING: ack=false bytes=" + j);
        }
    }

    public void f(a aVar, long j) {
        if (a()) {
            this.a.log(this.b, aVar + " PING: ack=true bytes=" + j);
        }
    }

    public void g(a aVar, int i, int i2, List list) {
        if (a()) {
            this.a.log(this.b, aVar + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list);
        }
    }

    public void h(a aVar, int i, EnumC7034oH enumC7034oH) {
        if (a()) {
            this.a.log(this.b, aVar + " RST_STREAM: streamId=" + i + " errorCode=" + enumC7034oH);
        }
    }

    public void i(a aVar, CQ0 cq0) {
        if (a()) {
            this.a.log(this.b, aVar + " SETTINGS: ack=false settings=" + m(cq0));
        }
    }

    public void j(a aVar) {
        if (a()) {
            this.a.log(this.b, aVar + " SETTINGS: ack=true");
        }
    }

    public void k(a aVar, int i, long j) {
        if (a()) {
            this.a.log(this.b, aVar + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }

    public C1716Np0(Level level, Logger logger) {
        this.b = (Level) AbstractC7785qy0.o(level, "level");
        this.a = (Logger) AbstractC7785qy0.o(logger, "logger");
    }
}
