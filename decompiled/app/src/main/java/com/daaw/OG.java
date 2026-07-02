package com.daaw;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class OG implements H70 {
    public final String a;
    public final int b;
    public final int c;
    public final NI0 d;
    public final NI0 e;
    public final InterfaceC6983o51 f;
    public final OI0 g;
    public final WI0 h;
    public final CG i;
    public final H70 j;
    public String k;
    public int l;
    public H70 m;

    public OG(String str, H70 h70, int i, int i2, NI0 ni0, NI0 ni02, InterfaceC6983o51 interfaceC6983o51, OI0 oi0, WI0 wi0, CG cg) {
        this.a = str;
        this.j = h70;
        this.b = i;
        this.c = i2;
        this.d = ni0;
        this.e = ni02;
        this.f = interfaceC6983o51;
        this.g = oi0;
        this.h = wi0;
        this.i = cg;
    }

    @Override // com.daaw.H70
    public void a(MessageDigest messageDigest) {
        byte[] bArrArray = ByteBuffer.allocate(8).putInt(this.b).putInt(this.c).array();
        this.j.a(messageDigest);
        messageDigest.update(this.a.getBytes("UTF-8"));
        messageDigest.update(bArrArray);
        NI0 ni0 = this.d;
        messageDigest.update((ni0 != null ? ni0.getId() : "").getBytes("UTF-8"));
        NI0 ni02 = this.e;
        messageDigest.update((ni02 != null ? ni02.getId() : "").getBytes("UTF-8"));
        InterfaceC6983o51 interfaceC6983o51 = this.f;
        messageDigest.update((interfaceC6983o51 != null ? interfaceC6983o51.getId() : "").getBytes("UTF-8"));
        OI0 oi0 = this.g;
        messageDigest.update((oi0 != null ? oi0.getId() : "").getBytes("UTF-8"));
        CG cg = this.i;
        messageDigest.update((cg != null ? cg.getId() : "").getBytes("UTF-8"));
    }

    public H70 b() {
        if (this.m == null) {
            this.m = new C6359lr0(this.a, this.j);
        }
        return this.m;
    }

    @Override // com.daaw.H70
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OG og = (OG) obj;
        if (!this.a.equals(og.a) || !this.j.equals(og.j) || this.c != og.c || this.b != og.b) {
            return false;
        }
        InterfaceC6983o51 interfaceC6983o51 = this.f;
        if ((interfaceC6983o51 == null) ^ (og.f == null)) {
            return false;
        }
        if (interfaceC6983o51 != null && !interfaceC6983o51.getId().equals(og.f.getId())) {
            return false;
        }
        NI0 ni0 = this.e;
        if ((ni0 == null) ^ (og.e == null)) {
            return false;
        }
        if (ni0 != null && !ni0.getId().equals(og.e.getId())) {
            return false;
        }
        NI0 ni02 = this.d;
        if ((ni02 == null) ^ (og.d == null)) {
            return false;
        }
        if (ni02 != null && !ni02.getId().equals(og.d.getId())) {
            return false;
        }
        OI0 oi0 = this.g;
        if ((oi0 == null) ^ (og.g == null)) {
            return false;
        }
        if (oi0 != null && !oi0.getId().equals(og.g.getId())) {
            return false;
        }
        WI0 wi0 = this.h;
        if ((wi0 == null) ^ (og.h == null)) {
            return false;
        }
        if (wi0 != null && !wi0.getId().equals(og.h.getId())) {
            return false;
        }
        CG cg = this.i;
        if ((cg == null) ^ (og.i == null)) {
            return false;
        }
        return cg == null || cg.getId().equals(og.i.getId());
    }

    @Override // com.daaw.H70
    public int hashCode() {
        if (this.l == 0) {
            int iHashCode = this.a.hashCode();
            this.l = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.j.hashCode()) * 31) + this.b) * 31) + this.c;
            this.l = iHashCode2;
            int i = iHashCode2 * 31;
            NI0 ni0 = this.d;
            int iHashCode3 = i + (ni0 != null ? ni0.getId().hashCode() : 0);
            this.l = iHashCode3;
            int i2 = iHashCode3 * 31;
            NI0 ni02 = this.e;
            int iHashCode4 = i2 + (ni02 != null ? ni02.getId().hashCode() : 0);
            this.l = iHashCode4;
            int i3 = iHashCode4 * 31;
            InterfaceC6983o51 interfaceC6983o51 = this.f;
            int iHashCode5 = i3 + (interfaceC6983o51 != null ? interfaceC6983o51.getId().hashCode() : 0);
            this.l = iHashCode5;
            int i4 = iHashCode5 * 31;
            OI0 oi0 = this.g;
            int iHashCode6 = i4 + (oi0 != null ? oi0.getId().hashCode() : 0);
            this.l = iHashCode6;
            int i5 = iHashCode6 * 31;
            WI0 wi0 = this.h;
            int iHashCode7 = i5 + (wi0 != null ? wi0.getId().hashCode() : 0);
            this.l = iHashCode7;
            int i6 = iHashCode7 * 31;
            CG cg = this.i;
            this.l = i6 + (cg != null ? cg.getId().hashCode() : 0);
        }
        return this.l;
    }

    public String toString() {
        if (this.k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineKey{");
            sb.append(this.a);
            sb.append('+');
            sb.append(this.j);
            sb.append("+[");
            sb.append(this.b);
            sb.append('x');
            sb.append(this.c);
            sb.append("]+");
            sb.append('\'');
            NI0 ni0 = this.d;
            sb.append(ni0 != null ? ni0.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            NI0 ni02 = this.e;
            sb.append(ni02 != null ? ni02.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            InterfaceC6983o51 interfaceC6983o51 = this.f;
            sb.append(interfaceC6983o51 != null ? interfaceC6983o51.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            OI0 oi0 = this.g;
            sb.append(oi0 != null ? oi0.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            WI0 wi0 = this.h;
            sb.append(wi0 != null ? wi0.getId() : "");
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            CG cg = this.i;
            sb.append(cg != null ? cg.getId() : "");
            sb.append('\'');
            sb.append('}');
            this.k = sb.toString();
        }
        return this.k;
    }
}
