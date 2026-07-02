package com.daaw;

/* JADX INFO: renamed from: com.daaw.z80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC10072z80 {

    /* JADX INFO: renamed from: com.daaw.z80$a */
    public interface a {
        void a();

        void b(C2352Tm0 c2352Tm0, C7165ol c7165ol);

        b c(C2352Tm0 c2352Tm0);

        void d(C2352Tm0 c2352Tm0, Object obj);

        void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02);

        a f(C2352Tm0 c2352Tm0, C6607ml c6607ml);
    }

    /* JADX INFO: renamed from: com.daaw.z80$b */
    public interface b {
        void a();

        void b(Object obj);

        void c(C6607ml c6607ml, C2352Tm0 c2352Tm0);

        a d(C6607ml c6607ml);

        void e(C7165ol c7165ol);
    }

    /* JADX INFO: renamed from: com.daaw.z80$c */
    public interface c {
        void a();

        a c(C6607ml c6607ml, RU0 ru0);
    }

    /* JADX INFO: renamed from: com.daaw.z80$d */
    public interface d {
        c a(C2352Tm0 c2352Tm0, String str, Object obj);

        e b(C2352Tm0 c2352Tm0, String str);
    }

    /* JADX INFO: renamed from: com.daaw.z80$e */
    public interface e extends c {
        a b(int i, C6607ml c6607ml, RU0 ru0);
    }

    C9514x80 a();

    void b(d dVar, byte[] bArr);

    void c(c cVar, byte[] bArr);

    C6607ml e();

    String getLocation();
}
