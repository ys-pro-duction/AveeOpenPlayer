package com.daaw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7911rR0 implements InterfaceC6921ns {
    public final String a;
    public final List b;
    public final boolean c;

    public C7911rR0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new C3276as(c4615ff0, abstractC9647xe, this);
    }

    public List b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
