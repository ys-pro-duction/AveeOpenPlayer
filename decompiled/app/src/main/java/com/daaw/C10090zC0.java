package com.daaw;

import com.daaw.InterfaceC9057vX;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.zC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10090zC0 implements InterfaceC9057vX {
    public int a = 0;
    public List c = new ArrayList();
    public InterfaceC9057vX.a b = null;

    @Override // com.daaw.InterfaceC9057vX
    public int a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC9057vX
    public void b(int i) {
        ListIterator listIterator = this.c.listIterator();
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            if (((Integer) listIterator.next()).intValue() == i) {
                this.a = iNextIndex;
                return;
            }
        }
    }

    @Override // com.daaw.InterfaceC9057vX
    public boolean c(List list, int i, int i2, boolean z, int i3) {
        ListIterator listIterator = this.c.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iF = C8974vC0.f(((Integer) listIterator.next()).intValue(), list, i, i2, z);
            if (iF < 0) {
                listIterator.remove();
                if (C8974vC0.j(this.a, iNextIndex) < 0) {
                    this.a = iNextIndex;
                    if (iNextIndex < 0) {
                        this.a = 0;
                    }
                    if (this.a >= this.c.size()) {
                        this.a = this.c.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(iF));
            }
        }
        InterfaceC9057vX.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.InterfaceC9057vX
    public int d(int i) {
        return Math.min(this.c.size(), i);
    }

    @Override // com.daaw.InterfaceC9057vX
    public boolean e(int i) {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 < this.c.size()) {
            return false;
        }
        this.a = this.c.size() - 1;
        return true;
    }

    @Override // com.daaw.InterfaceC9057vX
    public int f(int i, int i2) {
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    @Override // com.daaw.InterfaceC9057vX
    public void g() {
        int i = this.a - 1;
        this.a = i;
        if (i < 0) {
            this.a = 0;
        }
    }

    @Override // com.daaw.InterfaceC9057vX
    public int h(boolean z) {
        int i = this.a + 1;
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    @Override // com.daaw.InterfaceC9057vX
    public int i(boolean z) {
        int i = this.a;
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return ((Integer) this.c.get(this.a)).intValue();
    }

    @Override // com.daaw.InterfaceC9057vX
    public void j() {
        this.a = 0;
    }

    @Override // com.daaw.InterfaceC9057vX
    public boolean k(int i, int i2, int i3, boolean z, int i4) {
        ListIterator listIterator = this.c.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iH = C8974vC0.h(((Integer) listIterator.next()).intValue(), i, i2, i3, z);
            if (iH < 0) {
                listIterator.remove();
                if (C8974vC0.g(this.a, iNextIndex, -1) < 0) {
                    this.a = iNextIndex;
                    if (iNextIndex < 0) {
                        this.a = 0;
                    }
                    if (this.a >= this.c.size()) {
                        this.a = this.c.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(iH));
            }
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

    public void m(int i, List list, InterfaceC9057vX.a aVar) {
        this.b = aVar;
        this.c = list;
        this.a = 0;
        b(i);
        if (aVar != null) {
            aVar.a(this, false, true);
        }
    }
}
