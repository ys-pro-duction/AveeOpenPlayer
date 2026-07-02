package com.daaw;

/* JADX INFO: renamed from: com.daaw.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9398wk {
    public final char a;
    public final char b;
    public final int c;

    public C9398wk(char c, char c2) {
        this.a = c;
        this.b = c2;
        this.c = (c2 - c) + 1;
    }

    public static C9398wk b() {
        return new C9398wk((char) 1536, (char) 1791);
    }

    public static C9398wk c() {
        return new C9398wk(' ', '~');
    }

    public static C9398wk d() {
        return new C9398wk('0', 'Z');
    }

    public static C9398wk e() {
        return new C9398wk((char) 1024, (char) 1279);
    }

    public static C9398wk f() {
        return new C9398wk((char) 2304, (char) 2431);
    }

    public static C9398wk g() {
        return new C9398wk((char) 2688, (char) 2815);
    }

    public static C9398wk h() {
        return new C9398wk((char) 4352, (char) 4607);
    }

    public static C9398wk i() {
        return new C9398wk((char) 12352, (char) 12447);
    }

    public static C9398wk j() {
        return new C9398wk((char) 12448, (char) 12543);
    }

    public static C9398wk k() {
        return new C9398wk((char) 6016, (char) 6143);
    }

    public static C9398wk l() {
        return new C9398wk((char) 191, (char) 382);
    }

    public int a() {
        return this.c;
    }

    public char m(int i) {
        if (i >= this.c) {
            i = 0;
        }
        return (char) (this.a + i);
    }

    public int n(char c) {
        char c2 = this.a;
        if (c - c2 < this.c && c - c2 >= 0) {
            return c - c2;
        }
        return 0;
    }
}
