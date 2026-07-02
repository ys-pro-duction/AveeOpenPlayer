package com.daaw;

import com.daaw.AbstractC7898rO;
import com.daaw.InterfaceC6225lO;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.y21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9764y21 {
    public final D7 a;
    public final O21 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final InterfaceC4988gz g;
    public final EnumC7560q90 h;
    public final AbstractC7898rO.b i;
    public final long j;
    public InterfaceC6225lO.a k;

    public /* synthetic */ C9764y21(D7 d7, O21 o21, List list, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, AbstractC7898rO.b bVar, long j, AbstractC2911Yw abstractC2911Yw) {
        this(d7, o21, list, i, z, i2, interfaceC4988gz, enumC7560q90, bVar, j);
    }

    public final long a() {
        return this.j;
    }

    public final InterfaceC4988gz b() {
        return this.g;
    }

    public final AbstractC7898rO.b c() {
        return this.i;
    }

    public final EnumC7560q90 d() {
        return this.h;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9764y21)) {
            return false;
        }
        C9764y21 c9764y21 = (C9764y21) obj;
        return G10.c(this.a, c9764y21.a) && G10.c(this.b, c9764y21.b) && G10.c(this.c, c9764y21.c) && this.d == c9764y21.d && this.e == c9764y21.e && C21.d(this.f, c9764y21.f) && G10.c(this.g, c9764y21.g) && this.h == c9764y21.h && G10.c(this.i, c9764y21.i) && C6079kr.g(this.j, c9764y21.j);
    }

    public final int f() {
        return this.f;
    }

    public final List g() {
        return this.c;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + AbstractC8813ug.a(this.e)) * 31) + C21.e(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + C6079kr.q(this.j);
    }

    public final O21 i() {
        return this.b;
    }

    public final D7 j() {
        return this.a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) C21.f(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) C6079kr.r(this.j)) + ')';
    }

    public C9764y21(D7 d7, O21 o21, List list, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, InterfaceC6225lO.a aVar, AbstractC7898rO.b bVar, long j) {
        this.a = d7;
        this.b = o21;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = interfaceC4988gz;
        this.h = enumC7560q90;
        this.i = bVar;
        this.j = j;
        this.k = aVar;
    }

    public C9764y21(D7 d7, O21 o21, List list, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, AbstractC7898rO.b bVar, long j) {
        this(d7, o21, list, i, z, i2, interfaceC4988gz, enumC7560q90, (InterfaceC6225lO.a) null, bVar, j);
    }
}
