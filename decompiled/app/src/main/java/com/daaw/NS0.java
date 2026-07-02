package com.daaw;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NS0 extends AbstractC8510tb0 {
    public static final long E = System.currentTimeMillis();
    public static char F = ' ';
    public static boolean G = false;
    public static final PS0 H = new PS0();
    public int C;
    public transient String D = null;

    public NS0(String str) {
        this.C = 20;
        this.B = str;
        String strR = r();
        if (strR != null) {
            this.C = PS0.h(strR);
        } else {
            this.C = H.a;
        }
    }

    public static void l() {
        H.f();
    }

    public static void q() {
        if (G) {
            return;
        }
        G = true;
        l();
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean a() {
        return o(10);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean b() {
        return o(0);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean c() {
        return o(30);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean d() {
        return o(40);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean e() {
        return o(20);
    }

    @Override // com.daaw.L
    public void h(EnumC9633xb0 enumC9633xb0, InterfaceC1784Og0 interfaceC1784Og0, String str, Object[] objArr, Throwable th) {
        ArrayList arrayList;
        if (interfaceC1784Og0 != null) {
            arrayList = new ArrayList();
            arrayList.add(interfaceC1784Og0);
        } else {
            arrayList = null;
        }
        n(enumC9633xb0, arrayList, str, objArr, th);
    }

    public final String j() {
        String str = this.B;
        return str.substring(str.lastIndexOf(".") + 1);
    }

    public final String k() {
        String str;
        Date date = new Date();
        PS0 ps0 = H;
        synchronized (ps0.c) {
            str = ps0.c.format(date);
        }
        return str;
    }

    public final void n(EnumC9633xb0 enumC9633xb0, List list, String str, Object[] objArr, Throwable th) {
        StringBuilder sb = new StringBuilder(32);
        PS0 ps0 = H;
        if (ps0.b) {
            if (ps0.c != null) {
                sb.append(k());
                sb.append(F);
            } else {
                sb.append(System.currentTimeMillis() - E);
                sb.append(F);
            }
        }
        if (ps0.d) {
            sb.append('[');
            sb.append(Thread.currentThread().getName());
            sb.append("] ");
        }
        if (ps0.e) {
            sb.append("tid=");
            sb.append(Thread.currentThread().getId());
            sb.append(F);
        }
        if (ps0.h) {
            sb.append('[');
        }
        sb.append(enumC9633xb0.name());
        if (ps0.h) {
            sb.append(']');
        }
        sb.append(F);
        if (ps0.g) {
            if (this.D == null) {
                this.D = j();
            }
            sb.append(String.valueOf(this.D));
            sb.append(" - ");
        } else if (ps0.f) {
            sb.append(String.valueOf(this.B));
            sb.append(" - ");
        }
        if (list != null) {
            sb.append(F);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                throw null;
            }
        }
        sb.append(AbstractC1485Lj0.b(str, objArr));
        s(sb, th);
    }

    public boolean o(int i) {
        return i >= this.C;
    }

    public String r() {
        String strSubstring = this.B;
        int length = strSubstring.length();
        String strE = null;
        while (strE == null && length > -1) {
            strSubstring = strSubstring.substring(0, length);
            strE = H.e("org.slf4j.simpleLogger.log." + strSubstring, null);
            length = String.valueOf(strSubstring).lastIndexOf(".");
        }
        return strE;
    }

    public void s(StringBuilder sb, Throwable th) {
        PS0 ps0 = H;
        PrintStream printStreamA = ps0.j.a();
        synchronized (ps0) {
            printStreamA.println(sb.toString());
            t(th, printStreamA);
            printStreamA.flush();
        }
    }

    public void t(Throwable th, PrintStream printStream) {
        if (th != null) {
            th.printStackTrace(printStream);
        }
    }
}
