package com.daaw;

import com.daaw.InterfaceC9057vX;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9811yC0 implements InterfaceC9057vX {
    public InterfaceC9057vX.a b = null;
    public int a = 0;

    @Override // com.daaw.InterfaceC9057vX
    public int a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC9057vX
    public void b(int i) {
        this.a = i;
    }

    @Override // com.daaw.InterfaceC9057vX
    public boolean c(List list, int i, int i2, boolean z, int i3) {
        boolean z2;
        int iF = C8974vC0.f(this.a, list, i, i2, z);
        this.a = iF;
        if (iF < 0) {
            this.a = C8974vC0.i(iF, list, i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.a < 0) {
            this.a = 0;
            z2 = true;
        }
        if (this.a >= i3) {
            this.a = i3 - 1;
            z2 = true;
        }
        InterfaceC9057vX.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.InterfaceC9057vX
    public boolean e(int i) {
        int iH = h(false);
        this.a = iH;
        if (iH < i) {
            return false;
        }
        this.a = i - 1;
        return true;
    }

    @Override // com.daaw.InterfaceC9057vX
    public void g() {
        int iM = m(false);
        this.a = iM;
        if (iM < 0) {
            this.a = 0;
        }
    }

    @Override // com.daaw.InterfaceC9057vX
    public int h(boolean z) {
        return this.a + 1;
    }

    @Override // com.daaw.InterfaceC9057vX
    public int i(boolean z) {
        return this.a;
    }

    @Override // com.daaw.InterfaceC9057vX
    public void j() {
        this.a = 0;
    }

    @Override // com.daaw.InterfaceC9057vX
    public boolean k(int i, int i2, int i3, boolean z, int i4) {
        boolean z2;
        int iH = C8974vC0.h(this.a, i, i2, i3, z);
        this.a = iH;
        if (iH < 0) {
            this.a = i - 1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.a < 0) {
            this.a = 0;
            z2 = true;
        }
        if (this.a >= i4) {
            this.a = i4 - 1;
            z2 = true;
        }
        InterfaceC9057vX.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.InterfaceC9057vX
    public void l(int i) {
        this.a = i;
    }

    public int m(boolean z) {
        return this.a - 1;
    }

    public void n(int i, InterfaceC9057vX.a aVar) {
        this.b = aVar;
        this.a = 0;
        b(i);
        if (aVar != null) {
            aVar.a(this, false, true);
        }
    }

    @Override // com.daaw.InterfaceC9057vX
    public int d(int i) {
        return i;
    }

    @Override // com.daaw.InterfaceC9057vX
    public int f(int i, int i2) {
        return i;
    }
}
