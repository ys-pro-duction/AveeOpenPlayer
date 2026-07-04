package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8066rz implements InterfaceC6393lz {
    public AbstractC2745Xg1 d;
    public int f;
    public int g;
    public InterfaceC6393lz a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public VB i = null;
    public boolean j = false;
    public List k = new ArrayList();
    public List l = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.rz$a */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C8066rz(AbstractC2745Xg1 abstractC2745Xg1) {
        this.d = abstractC2745Xg1;
    }

    @Override // com.daaw.InterfaceC6393lz
    public void a(InterfaceC6393lz interfaceC6393lz) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            if (!((C8066rz) it.next()).j) {
                return;
            }
        }
        this.c = true;
        InterfaceC6393lz interfaceC6393lz2 = this.a;
        if (interfaceC6393lz2 != null) {
            interfaceC6393lz2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        C8066rz c8066rz = null;
        int i = 0;
        for (C8066rz c8066rz2 : this.l) {
            if (!(c8066rz2 instanceof VB)) {
                i++;
                c8066rz = c8066rz2;
            }
        }
        if (c8066rz != null && i == 1 && c8066rz.j) {
            VB vb = this.i;
            if (vb != null) {
                if (!vb.j) {
                    return;
                } else {
                    this.f = this.h * vb.g;
                }
            }
            d(c8066rz.g + this.f);
        }
        InterfaceC6393lz interfaceC6393lz3 = this.a;
        if (interfaceC6393lz3 != null) {
            interfaceC6393lz3.a(this);
        }
    }

    public void b(InterfaceC6393lz interfaceC6393lz) {
        this.k.add(interfaceC6393lz);
        if (this.j) {
            interfaceC6393lz.a(interfaceC6393lz);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (InterfaceC6393lz interfaceC6393lz : this.k) {
            interfaceC6393lz.a(interfaceC6393lz);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.r());
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
