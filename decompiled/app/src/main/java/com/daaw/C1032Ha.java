package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1032Ha {
    public static final C1032Ha a = new C1032Ha();
    public static final d b = new i();
    public static final d c = new c();
    public static final k d = new j();
    public static final k e = new a();
    public static final e f = new b();
    public static final e g = new h();
    public static final e h = new g();
    public static final e i = new f();

    /* JADX INFO: renamed from: com.daaw.Ha$a */
    public static final class a implements k {
        @Override // com.daaw.C1032Ha.k
        public /* synthetic */ float a() {
            return AbstractC1240Ja.a(this);
        }

        @Override // com.daaw.C1032Ha.k
        public void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(iArr2, "outPositions");
            C1032Ha.a.g(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$b */
    public static final class b implements e {
        public final float a = C6460mD.l(0);

        @Override // com.daaw.C1032Ha.d, com.daaw.C1032Ha.k
        public float a() {
            return this.a;
        }

        @Override // com.daaw.C1032Ha.d
        public void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(iArr2, "outPositions");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                C1032Ha.a.e(i, iArr, iArr2, false);
            } else {
                C1032Ha.a.e(i, iArr, iArr2, true);
            }
        }

        @Override // com.daaw.C1032Ha.k
        public void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(iArr2, "outPositions");
            C1032Ha.a.e(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$c */
    public static final class c implements d {
        @Override // com.daaw.C1032Ha.d, com.daaw.C1032Ha.k
        public /* synthetic */ float a() {
            return AbstractC1136Ia.a(this);
        }

        @Override // com.daaw.C1032Ha.d
        public void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(iArr2, "outPositions");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                C1032Ha.a.g(i, iArr, iArr2, false);
            } else {
                C1032Ha.a.f(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$d */
    public interface d {
        float a();

        void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2);
    }

    /* JADX INFO: renamed from: com.daaw.Ha$e */
    public interface e extends d, k {
    }

    /* JADX INFO: renamed from: com.daaw.Ha$f */
    public static final class f implements e {
        public final float a = C6460mD.l(0);

        @Override // com.daaw.C1032Ha.d, com.daaw.C1032Ha.k
        public float a() {
            return this.a;
        }

        @Override // com.daaw.C1032Ha.d
        public void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(iArr2, "outPositions");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                C1032Ha.a.h(i, iArr, iArr2, false);
            } else {
                C1032Ha.a.h(i, iArr, iArr2, true);
            }
        }

        @Override // com.daaw.C1032Ha.k
        public void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(iArr2, "outPositions");
            C1032Ha.a.h(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$g */
    public static final class g implements e {
        public final float a = C6460mD.l(0);

        @Override // com.daaw.C1032Ha.d, com.daaw.C1032Ha.k
        public float a() {
            return this.a;
        }

        @Override // com.daaw.C1032Ha.d
        public void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(iArr2, "outPositions");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                C1032Ha.a.i(i, iArr, iArr2, false);
            } else {
                C1032Ha.a.i(i, iArr, iArr2, true);
            }
        }

        @Override // com.daaw.C1032Ha.k
        public void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(iArr2, "outPositions");
            C1032Ha.a.i(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$h */
    public static final class h implements e {
        public final float a = C6460mD.l(0);

        @Override // com.daaw.C1032Ha.d, com.daaw.C1032Ha.k
        public float a() {
            return this.a;
        }

        @Override // com.daaw.C1032Ha.d
        public void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(iArr2, "outPositions");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                C1032Ha.a.j(i, iArr, iArr2, false);
            } else {
                C1032Ha.a.j(i, iArr, iArr2, true);
            }
        }

        @Override // com.daaw.C1032Ha.k
        public void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(iArr2, "outPositions");
            C1032Ha.a.j(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$i */
    public static final class i implements d {
        @Override // com.daaw.C1032Ha.d, com.daaw.C1032Ha.k
        public /* synthetic */ float a() {
            return AbstractC1136Ia.a(this);
        }

        @Override // com.daaw.C1032Ha.d
        public void b(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, EnumC7560q90 enumC7560q90, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(iArr2, "outPositions");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                C1032Ha.a.f(iArr, iArr2, false);
            } else {
                C1032Ha.a.g(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$j */
    public static final class j implements k {
        @Override // com.daaw.C1032Ha.k
        public /* synthetic */ float a() {
            return AbstractC1240Ja.a(this);
        }

        @Override // com.daaw.C1032Ha.k
        public void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2) {
            G10.g(interfaceC4988gz, "<this>");
            G10.g(iArr, "sizes");
            G10.g(iArr2, "outPositions");
            C1032Ha.a.f(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ha$k */
    public interface k {
        float a();

        void c(InterfaceC4988gz interfaceC4988gz, int i, int[] iArr, int[] iArr2);
    }

    public final e a() {
        return f;
    }

    public final e b() {
        return h;
    }

    public final d c() {
        return b;
    }

    public final k d() {
        return d;
    }

    public final void e(int i2, int[] iArr, int[] iArr2, boolean z) {
        G10.g(iArr, "size");
        G10.g(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = AbstractC8261sh0.b(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = AbstractC8261sh0.b(f2);
            f2 += i8;
        }
    }

    public final void f(int[] iArr, int[] iArr2, boolean z) {
        G10.g(iArr, "size");
        G10.g(iArr2, "outPosition");
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public final void g(int i2, int[] iArr, int[] iArr2, boolean z) {
        G10.g(iArr, "size");
        G10.g(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public final void h(int i2, int[] iArr, int[] iArr2, boolean z) {
        G10.g(iArr, "size");
        G10.g(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = !(iArr.length == 0) ? (i2 - i4) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = AbstractC8261sh0.b(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = AbstractC8261sh0.b(f2);
            f2 += i8 + length;
            i3++;
            i7++;
        }
    }

    public final void i(int i2, int[] iArr, int[] iArr2, boolean z) {
        G10.g(iArr, "size");
        G10.g(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = 0.0f;
        float length = iArr.length > 1 ? (i2 - i4) / (iArr.length - 1) : 0.0f;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = AbstractC8261sh0.b(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = AbstractC8261sh0.b(f2);
            f2 += i8 + length;
            i3++;
            i7++;
        }
    }

    public final void j(int i2, int[] iArr, int[] iArr2, boolean z) {
        G10.g(iArr, "size");
        G10.g(iArr2, "outPosition");
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = AbstractC8261sh0.b(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = AbstractC8261sh0.b(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }
}
