package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IL1 extends AbstractBinderC8773uX1 {
    public final Z9 B;

    public IL1(Z9 z9) {
        this.B = z9;
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final Map A2(String str, String str2, boolean z) {
        return this.B.m(str, str2, z);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void F(Bundle bundle) {
        this.B.s(bundle);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void K2(String str, String str2, Bundle bundle) {
        this.B.b(str, str2, bundle);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void L1(String str, String str2, Bundle bundle) {
        this.B.n(str, str2, bundle);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void i2(InterfaceC7934rX interfaceC7934rX, String str, String str2) {
        this.B.t(interfaceC7934rX != null ? (Activity) BinderC7744qp0.I(interfaceC7934rX) : null, str, str2);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void p(String str) {
        this.B.a(str);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void p2(String str, String str2, InterfaceC7934rX interfaceC7934rX) {
        this.B.u(str, str2, interfaceC7934rX != null ? BinderC7744qp0.I(interfaceC7934rX) : null);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void q(Bundle bundle) {
        this.B.o(bundle);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void u(Bundle bundle) {
        this.B.r(bundle);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final Bundle y(Bundle bundle) {
        return this.B.p(bundle);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final List y1(String str, String str2) {
        return this.B.g(str, str2);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final int zzb(String str) {
        return this.B.l(str);
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final long zzc() {
        return this.B.d();
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final String zze() {
        return this.B.e();
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final String zzf() {
        return this.B.f();
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final String zzg() {
        return this.B.h();
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final String zzh() {
        return this.B.i();
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final String zzi() {
        return this.B.j();
    }

    @Override // com.daaw.InterfaceC9059vX1
    public final void zzn(String str) {
        this.B.c(str);
    }
}
