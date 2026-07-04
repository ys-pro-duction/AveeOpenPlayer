package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J02 extends QA1 {
    public final F32 B;
    public F32 C;

    public J02(F32 f32) {
        this.B = f32;
        if (f32.t()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.C = f32.i();
    }

    public static void i(Object obj, Object obj2) {
        C0586Cu2.a().b(obj.getClass()).d(obj, obj2);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final J02 clone() {
        J02 j02 = (J02) this.B.u(5, null, null);
        j02.C = zzg();
        return j02;
    }

    public final J02 d(F32 f32) {
        if (!this.B.equals(f32)) {
            if (!this.C.t()) {
                h();
            }
            i(this.C, f32);
        }
        return this;
    }

    public final F32 e() {
        F32 f32Zzg = zzg();
        if (f32Zzg.h()) {
            return f32Zzg;
        }
        throw new TF2(f32Zzg);
    }

    @Override // com.daaw.InterfaceC1507Lo2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public F32 zzg() {
        if (!this.C.t()) {
            return this.C;
        }
        this.C.o();
        return this.C;
    }

    public final void g() {
        if (this.C.t()) {
            return;
        }
        h();
    }

    public void h() {
        F32 f32I = this.B.i();
        i(f32I, this.C);
        this.C = f32I;
    }
}
