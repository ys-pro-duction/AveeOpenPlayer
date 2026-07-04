package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.xP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9584xP0 {
    public static final C9584xP0 a = new C9584xP0();
    public static final BP0 b = new BP0("ContentDescription", a.B);
    public static final BP0 c = new BP0("StateDescription", null, 2, null);
    public static final BP0 d = new BP0("ProgressBarRangeInfo", null, 2, null);
    public static final BP0 e = new BP0("PaneTitle", e.B);
    public static final BP0 f = new BP0("SelectableGroup", null, 2, null);
    public static final BP0 g = new BP0("CollectionInfo", null, 2, null);
    public static final BP0 h = new BP0("CollectionItemInfo", null, 2, null);
    public static final BP0 i = new BP0("Heading", null, 2, null);
    public static final BP0 j = new BP0("Disabled", null, 2, null);
    public static final BP0 k = new BP0("LiveRegion", null, 2, null);
    public static final BP0 l = new BP0("Focused", null, 2, null);
    public static final BP0 m = new BP0("InvisibleToUser", b.B);
    public static final BP0 n = new BP0("HorizontalScrollAxisRange", null, 2, null);
    public static final BP0 o = new BP0("VerticalScrollAxisRange", null, 2, null);
    public static final BP0 p = new BP0("IsPopup", d.B);
    public static final BP0 q = new BP0("IsDialog", c.B);
    public static final BP0 r = new BP0("Role", f.B);
    public static final BP0 s = new BP0("TestTag", g.B);
    public static final BP0 t = new BP0("Text", h.B);
    public static final BP0 u = new BP0("EditableText", null, 2, null);
    public static final BP0 v = new BP0("TextSelectionRange", null, 2, null);
    public static final BP0 w = new BP0("ImeAction", null, 2, null);
    public static final BP0 x = new BP0("Selected", null, 2, null);
    public static final BP0 y = new BP0("ToggleableState", null, 2, null);
    public static final BP0 z = new BP0("Password", null, 2, null);
    public static final BP0 A = new BP0("Error", null, 2, null);
    public static final BP0 B = new BP0("IndexForKey", null, 2, null);

    /* JADX INFO: renamed from: com.daaw.xP0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listO0;
            G10.g(list2, "childValue");
            if (list == null || (listO0 = AbstractC2455Um.O0(list)) == null) {
                return list2;
            }
            listO0.addAll(list2);
            return listO0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xP0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G91 invoke(G91 g91, G91 g912) {
            G10.g(g912, "<anonymous parameter 1>");
            return g91;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xP0$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final c B = new c();

        public c() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G91 invoke(G91 g91, G91 g912) {
            G10.g(g912, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: renamed from: com.daaw.xP0$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final d B = new d();

        public d() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G91 invoke(G91 g91, G91 g912) {
            G10.g(g912, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: renamed from: com.daaw.xP0$e */
    public static final class e extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final e B = new e();

        public e() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            G10.g(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* JADX INFO: renamed from: com.daaw.xP0$g */
    public static final class g extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final g B = new g();

        public g() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            G10.g(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xP0$h */
    public static final class h extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final h B = new h();

        public h() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listO0;
            G10.g(list2, "childValue");
            if (list == null || (listO0 = AbstractC2455Um.O0(list)) == null) {
                return list2;
            }
            listO0.addAll(list2);
            return listO0;
        }
    }

    public final BP0 a() {
        return g;
    }

    public final BP0 b() {
        return h;
    }

    public final BP0 c() {
        return b;
    }

    public final BP0 d() {
        return j;
    }

    public final BP0 e() {
        return u;
    }

    public final BP0 f() {
        return A;
    }

    public final BP0 g() {
        return l;
    }

    public final BP0 h() {
        return i;
    }

    public final BP0 i() {
        return n;
    }

    public final BP0 j() {
        return w;
    }

    public final BP0 k() {
        return m;
    }

    public final BP0 l() {
        return q;
    }

    public final BP0 m() {
        return k;
    }

    public final BP0 n() {
        return e;
    }

    public final BP0 o() {
        return z;
    }

    public final BP0 p() {
        return d;
    }

    public final BP0 q() {
        return r;
    }

    public final BP0 r() {
        return f;
    }

    public final BP0 s() {
        return x;
    }

    public final BP0 t() {
        return c;
    }

    public final BP0 u() {
        return s;
    }

    public final BP0 v() {
        return t;
    }

    public final BP0 w() {
        return v;
    }

    public final BP0 x() {
        return y;
    }

    public final BP0 y() {
        return o;
    }

    /* JADX INFO: renamed from: com.daaw.xP0$f */
    public static final class f extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final f B = new f();

        public f() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((OJ0) obj, ((OJ0) obj2).m());
        }

        public final OJ0 a(OJ0 oj0, int i) {
            return oj0;
        }
    }
}
