package com.daaw;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.r21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7804r21 implements InterfaceC5252hv0 {
    public final View a;
    public final UZ b;
    public boolean c;
    public NQ d;
    public NQ e;
    public C3601c21 f;
    public GY g;
    public YE0 h;
    public final O90 i;
    public final InterfaceC3236ak j;

    /* JADX INFO: renamed from: com.daaw.r21$a */
    public enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: renamed from: com.daaw.r21$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.StartInput.ordinal()] = 1;
            iArr[a.StopInput.ordinal()] = 2;
            iArr[a.ShowKeyboard.ordinal()] = 3;
            iArr[a.HideKeyboard.ordinal()] = 4;
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.r21$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public c() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(C7804r21.this.f(), false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.r21$d */
    public static final class d implements RZ {
        public d() {
        }

        @Override // com.daaw.RZ
        public void a(KeyEvent keyEvent) {
            G10.g(keyEvent, "event");
            C7804r21.this.e().sendKeyEvent(keyEvent);
        }

        @Override // com.daaw.RZ
        public void b(int i) {
            C7804r21.this.e.invoke(FY.i(i));
        }

        @Override // com.daaw.RZ
        public void c(List list) {
            G10.g(list, "editCommands");
            C7804r21.this.d.invoke(list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.r21$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public static final e B = new e();

        public e() {
            super(1);
        }

        public final void invoke(List list) {
            G10.g(list, "it");
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.r21$g */
    public static final class g extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public /* synthetic */ Object G;
        public int I;

        public g(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.G = obj;
            this.I |= Integer.MIN_VALUE;
            return C7804r21.this.j(this);
        }
    }

    public C7804r21(View view, UZ uz) {
        G10.g(view, "view");
        G10.g(uz, "inputMethodManager");
        this.a = view;
        this.b = uz;
        this.d = e.B;
        this.e = f.B;
        this.f = new C3601c21("", G21.b.a(), (G21) null, 4, (AbstractC2911Yw) null);
        this.g = GY.f.a();
        this.i = AbstractC3192ab0.b(EnumC7395pb0.D, new c());
        this.j = AbstractC6035kk.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    public static final void k(a aVar, C6748nF0 c6748nF0, C6748nF0 c6748nF02) {
        int i = b.a[aVar.ordinal()];
        if (i == 1) {
            Boolean bool = Boolean.TRUE;
            c6748nF0.B = bool;
            c6748nF02.B = bool;
        } else if (i == 2) {
            Boolean bool2 = Boolean.FALSE;
            c6748nF0.B = bool2;
            c6748nF02.B = bool2;
        } else if ((i == 3 || i == 4) && !G10.c(c6748nF0.B, Boolean.FALSE)) {
            c6748nF02.B = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    public final InputConnection d(EditorInfo editorInfo) {
        G10.g(editorInfo, "outAttrs");
        if (!this.c) {
            return null;
        }
        AbstractC8083s21.b(editorInfo, this.g, this.f);
        YE0 ye0 = new YE0(this.f, new d(), this.g.b());
        this.h = ye0;
        return ye0;
    }

    public final BaseInputConnection e() {
        return (BaseInputConnection) this.i.getValue();
    }

    public final View f() {
        return this.a;
    }

    public final boolean g() {
        return this.c;
    }

    public final void h() {
        this.b.c(this.a);
    }

    public final void i(boolean z) {
        if (z) {
            this.b.b(this.a);
        } else {
            this.b.a(this.a.getWindowToken());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(com.daaw.InterfaceC1416Ks r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.daaw.C7804r21.g
            if (r0 == 0) goto L13
            r0 = r9
            com.daaw.r21$g r0 = (com.daaw.C7804r21.g) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.r21$g r0 = new com.daaw.r21$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.G
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.F
            com.daaw.jk r2 = (com.daaw.InterfaceC5756jk) r2
            java.lang.Object r4 = r0.E
            com.daaw.r21 r4 = (com.daaw.C7804r21) r4
            com.daaw.AbstractC4801gJ0.b(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            com.daaw.AbstractC4801gJ0.b(r9)
            com.daaw.ak r9 = r8.j
            com.daaw.jk r9 = r9.iterator()
            r4 = r8
            r2 = r9
        L44:
            r0.E = r4
            r0.F = r2
            r0.I = r3
            java.lang.Object r9 = r2.a(r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = r2.next()
            com.daaw.r21$a r9 = (com.daaw.C7804r21.a) r9
            android.view.View r5 = r4.a
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L74
        L67:
            com.daaw.ak r9 = r4.j
            java.lang.Object r9 = r9.f()
            boolean r9 = com.daaw.AbstractC7160ok.f(r9)
            if (r9 != 0) goto L67
            goto L44
        L74:
            com.daaw.nF0 r5 = new com.daaw.nF0
            r5.<init>()
            com.daaw.nF0 r6 = new com.daaw.nF0
            r6.<init>()
        L7e:
            if (r9 == 0) goto L90
            k(r9, r5, r6)
            com.daaw.ak r9 = r4.j
            java.lang.Object r9 = r9.f()
            java.lang.Object r9 = com.daaw.AbstractC7160ok.d(r9)
            com.daaw.r21$a r9 = (com.daaw.C7804r21.a) r9
            goto L7e
        L90:
            java.lang.Object r9 = r5.B
            java.lang.Boolean r7 = com.daaw.AbstractC0527Cg.a(r3)
            boolean r9 = com.daaw.G10.c(r9, r7)
            if (r9 == 0) goto L9f
            r4.h()
        L9f:
            java.lang.Object r9 = r6.B
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto Lac
            boolean r9 = r9.booleanValue()
            r4.i(r9)
        Lac:
            java.lang.Object r9 = r5.B
            r5 = 0
            java.lang.Boolean r5 = com.daaw.AbstractC0527Cg.a(r5)
            boolean r9 = com.daaw.G10.c(r9, r5)
            if (r9 == 0) goto L44
            r4.h()
            goto L44
        Lbd:
            com.daaw.G91 r9 = com.daaw.G91.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7804r21.j(com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7804r21(View view) {
        G10.g(view, "view");
        Context context = view.getContext();
        G10.f(context, "view.context");
        this(view, new VZ(context));
    }

    /* JADX INFO: renamed from: com.daaw.r21$f */
    public static final class f extends AbstractC4192e90 implements NQ {
        public static final f B = new f();

        public f() {
            super(1);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((FY) obj).o());
            return G91.a;
        }

        public final void a(int i) {
        }
    }
}
