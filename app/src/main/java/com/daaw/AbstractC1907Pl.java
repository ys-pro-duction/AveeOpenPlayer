package com.daaw;

import com.daaw.C1168Ii;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1907Pl {
    public static final Logger a = Logger.getLogger(AbstractC1907Pl.class.getName());
    public static boolean b;
    public static final C1168Ii.c c;

    /* JADX INFO: renamed from: com.daaw.Pl$a */
    public enum a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    static {
        b = !AbstractC7939rY0.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        c = C1168Ii.c.b("internal-stub-type");
    }
}
