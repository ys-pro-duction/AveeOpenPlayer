package com.daaw;

import com.daaw.C0745Eg0;
import com.google.firebase.Timestamp;

/* JADX INFO: renamed from: com.daaw.cQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3704cQ0 {
    public static Q31 a(C6564mc1 c6564mc1) {
        return c6564mc1.s0().f0("__local_write_time__").v0();
    }

    public static C6564mc1 b(C6564mc1 c6564mc1) {
        C6564mc1 c6564mc1E0 = c6564mc1.s0().e0("__previous_value__", null);
        return c(c6564mc1E0) ? b(c6564mc1E0) : c6564mc1E0;
    }

    public static boolean c(C6564mc1 c6564mc1) {
        C6564mc1 c6564mc1E0 = c6564mc1 != null ? c6564mc1.s0().e0("__type__", null) : null;
        return c6564mc1E0 != null && "server_timestamp".equals(c6564mc1E0.u0());
    }

    public static C6564mc1 d(Timestamp timestamp, C6564mc1 c6564mc1) {
        C6564mc1 c6564mc12 = (C6564mc1) C6564mc1.x0().K("server_timestamp").n();
        C0745Eg0.b bVarZ = C0745Eg0.j0().z("__type__", c6564mc12).z("__local_write_time__", (C6564mc1) C6564mc1.x0().L(Q31.f0().y(timestamp.g()).x(timestamp.c())).n());
        if (c(c6564mc1)) {
            c6564mc1 = b(c6564mc1);
        }
        if (c6564mc1 != null) {
            bVarZ.z("__previous_value__", c6564mc1);
        }
        return (C6564mc1) C6564mc1.x0().E(bVarZ).n();
    }
}
