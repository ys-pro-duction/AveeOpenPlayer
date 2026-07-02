package com.daaw;

import android.app.Activity;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C5004h20;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1312Js {
    public boolean a = false;
    public HashMap b = new HashMap();
    public List c = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.Js$a */
    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            C1312Js.this.a = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$b */
    public class b implements C0321Ag1.a {
        public b() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C5004h20.a aVar, Boolean bool) {
            C5004h20 c5004h20 = (C5004h20) C1312Js.this.b.get(aVar.c());
            if (c5004h20 == null) {
                c5004h20 = new C5004h20(aVar.c());
                C1312Js.this.b.put(aVar.c(), c5004h20);
            }
            if (bool.booleanValue()) {
                c5004h20.a(aVar);
            } else {
                c5004h20.c(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$c */
    public class c implements C10217zg1.a {
        public c() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(InterfaceC5694jX interfaceC5694jX) {
            C1312Js.this.b.remove(interfaceC5694jX);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$d */
    public class d implements C9938yg1.a {
        public d() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            Iterator it = new ArrayList(C1312Js.this.b.keySet()).iterator();
            while (it.hasNext()) {
                C1104Hs.g.a((InterfaceC5694jX) it.next());
            }
            C1312Js.this.b.clear();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$e */
    public class e implements C10217zg1.a {
        public e() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Activity activity) {
            C1104Hs c1104HsJ = C1104Hs.j();
            if (c1104HsJ != null) {
                c1104HsJ.n();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$f */
    public class f implements C9938yg1.a {
        public f() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C1104Hs c1104HsJ = C1104Hs.j();
            if (c1104HsJ != null) {
                c1104HsJ.k();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$g */
    public class g implements C0425Bg1.a {
        public g() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(AbstractC7524q2[] abstractC7524q2Arr, Boolean bool, C5004h20.a aVar) {
            C1104Hs c1104HsJ = C1104Hs.j();
            if (c1104HsJ != null) {
                c1104HsJ.l(abstractC7524q2Arr, bool, aVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$h */
    public class h implements C0746Eg1.a {
        public h() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke() {
            return Boolean.valueOf(C1312Js.this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Js$i */
    public class i implements C0850Fg1.a {
        public i() {
        }

        @Override // com.daaw.C0850Fg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(C5004h20.a aVar) {
            return Boolean.valueOf(C1312Js.this.d(aVar));
        }
    }

    public C1312Js() {
        C1104Hs.e.b(new a(), this.c);
        C1104Hs.f.b(new b(), this.c);
        C1104Hs.g.b(new c(), this.c);
        C1104Hs.h.b(new d(), this.c);
        MainActivity.J0.b(new e(), this.c);
        MainActivity.P0.b(new f(), this.c);
        FragmentC10191zb0.Z.b(new g(), this.c);
        FragmentC10191zb0.a0.b(new h(), this.c);
        FragmentC10191zb0.s0.b(new i(), this.c);
    }

    public boolean d(C5004h20.a aVar) {
        C5004h20 c5004h20 = (C5004h20) this.b.get(aVar.c());
        return c5004h20 != null && c5004h20.b(aVar.d());
    }
}
