package com.daaw;

import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.daaw.oM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7057oM2 extends AbstractC5094hM2 {
    public CO2 B;
    public CO2 C;
    public InterfaceC6778nM2 D;
    public HttpURLConnection E;

    public C7057oM2(CO2 co2, CO2 co22, InterfaceC6778nM2 interfaceC6778nM2) {
        this.B = co2;
        this.C = co22;
        this.D = interfaceC6778nM2;
    }

    public static void F(HttpURLConnection httpURLConnection) {
        AbstractC5373iM2.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static /* synthetic */ Integer c() {
        return -1;
    }

    public static /* synthetic */ Integer d() {
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        F(this.E);
    }

    public HttpURLConnection o() {
        AbstractC5373iM2.b(((Integer) this.B.zza()).intValue(), ((Integer) this.C.zza()).intValue());
        InterfaceC6778nM2 interfaceC6778nM2 = this.D;
        interfaceC6778nM2.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC6778nM2.zza();
        this.E = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection s(InterfaceC6778nM2 interfaceC6778nM2, final int i, final int i2) {
        this.B = new CO2() { // from class: com.daaw.lM2
            @Override // com.daaw.CO2
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.C = new CO2() { // from class: com.daaw.mM2
            @Override // com.daaw.CO2
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.D = interfaceC6778nM2;
        return o();
    }

    public C7057oM2() {
        this(new CO2() { // from class: com.daaw.jM2
            @Override // com.daaw.CO2
            public final Object zza() {
                return C7057oM2.c();
            }
        }, new CO2() { // from class: com.daaw.kM2
            @Override // com.daaw.CO2
            public final Object zza() {
                return C7057oM2.d();
            }
        }, null);
    }
}
