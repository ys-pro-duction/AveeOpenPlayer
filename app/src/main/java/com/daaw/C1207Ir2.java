package com.daaw;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ir2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1207Ir2 implements InterfaceC7500pw2 {
    public final InterfaceC7467pp2 a;
    public final AbstractC9550xG2 b;
    public final boolean c;
    public final AbstractC4850gV1 d;

    public C1207Ir2(AbstractC9550xG2 abstractC9550xG2, AbstractC4850gV1 abstractC4850gV1, InterfaceC7467pp2 interfaceC7467pp2) {
        this.b = abstractC9550xG2;
        this.c = abstractC4850gV1.f(interfaceC7467pp2);
        this.d = abstractC4850gV1;
        this.a = interfaceC7467pp2;
    }

    public static C1207Ir2 h(AbstractC9550xG2 abstractC9550xG2, AbstractC4850gV1 abstractC4850gV1, InterfaceC7467pp2 interfaceC7467pp2) {
        return new C1207Ir2(abstractC9550xG2, abstractC4850gV1, interfaceC7467pp2);
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final int a(Object obj) {
        int iHashCode = this.b.d(obj).hashCode();
        return this.c ? (iHashCode * 53) + this.d.b(obj).a.hashCode() : iHashCode;
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final void b(Object obj) {
        this.b.g(obj);
        this.d.d(obj);
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final boolean c(Object obj) {
        return this.d.b(obj).h();
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final void d(Object obj, Object obj2) {
        AbstractC9742xx2.x(this.b, obj, obj2);
        if (this.c) {
            AbstractC9742xx2.w(this.d, obj, obj2);
        }
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final boolean e(Object obj, Object obj2) {
        AbstractC9550xG2 abstractC9550xG2 = this.b;
        if (!abstractC9550xG2.d(obj).equals(abstractC9550xG2.d(obj2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(obj).equals(this.d.b(obj2));
        }
        return true;
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final void f(Object obj, byte[] bArr, int i, int i2, C6745nE1 c6745nE1) {
        F32 f32 = (F32) obj;
        if (f32.zzc == C3113aH2.c()) {
            f32.zzc = C3113aH2.f();
        }
        AbstractC6314li0.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final void g(Object obj, InterfaceC10148zQ2 interfaceC10148zQ2) {
        Iterator itD = this.d.b(obj).d();
        if (itD.hasNext()) {
            AbstractC6314li0.a(((Map.Entry) itD.next()).getKey());
            throw null;
        }
        AbstractC9550xG2 abstractC9550xG2 = this.b;
        abstractC9550xG2.i(abstractC9550xG2.d(obj), interfaceC10148zQ2);
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final int zza(Object obj) {
        AbstractC9550xG2 abstractC9550xG2 = this.b;
        int iB = abstractC9550xG2.b(abstractC9550xG2.d(obj));
        return this.c ? iB + this.d.b(obj).c() : iB;
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final Object zze() {
        InterfaceC7467pp2 interfaceC7467pp2 = this.a;
        return interfaceC7467pp2 instanceof F32 ? ((F32) interfaceC7467pp2).i() : interfaceC7467pp2.zzE().zzg();
    }
}
