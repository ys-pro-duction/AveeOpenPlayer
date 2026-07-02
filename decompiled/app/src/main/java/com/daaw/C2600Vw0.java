package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import com.daaw.AsyncTaskC7617qN0;
import com.daaw.C0321Ag1;
import com.daaw.C0425Bg1;
import com.daaw.C0642Dg1;
import com.daaw.C0746Eg1;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2600Vw0 {
    public C6784nO0 a = new C6784nO0();
    public p b = new p();
    public r c = new r();
    public List d = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Vw0$a */
    public class a implements C0642Dg1.a {
        public a() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(Context context, Long l, long[] jArr, List list, Boolean bool) {
            int iA = AbstractC1848Ow0.a(context, l.longValue(), jArr, bool.booleanValue());
            C2600Vw0.this.m();
            if (bool.booleanValue()) {
                AbstractC5075hI.a.a(context.getResources().getQuantityString(FD0.s, iA, Integer.valueOf(iA)));
            } else {
                AbstractC5075hI.a.a(context.getResources().getQuantityString(FD0.n, iA, Integer.valueOf(iA)));
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$b */
    public class b implements C0642Dg1.a {
        public b() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(String str, String str2, List list, Boolean bool, Boolean bool2) {
            C7378pX0 c7378pX0 = new C7378pX0();
            int iB = C1225Iw0.h().b(c7378pX0, str2, list, bool.booleanValue(), bool2.booleanValue());
            C2600Vw0.this.m();
            Context contextH = com.daaw.avee.a.h();
            if (contextH != null) {
                if (iB <= 0) {
                    if (c7378pX0.f()) {
                        AbstractC5075hI.a.a(c7378pX0.e());
                    }
                } else if (bool.booleanValue()) {
                    AbstractC5075hI.a.a(contextH.getResources().getQuantityString(FD0.s, iB, Integer.valueOf(iB)));
                } else {
                    AbstractC5075hI.a.a(contextH.getResources().getQuantityString(FD0.n, iB, Integer.valueOf(iB)));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$c */
    public class c implements C0321Ag1.a {
        public c() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Long l, String str) {
            TG0.a(l, str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$d */
    public class d implements C0425Bg1.a {
        public d() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Context context, Long l, String str) {
            AbstractC1848Ow0.e(context, l.longValue(), str);
            C2600Vw0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$e */
    public class e implements C0321Ag1.a {
        public e() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Long l, String str) {
            C2600Vw0.this.k(l);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$f */
    public class f implements C0746Eg1.a {
        public f() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 invoke() {
            Context contextK = com.daaw.avee.a.k();
            if (contextK == null) {
                return null;
            }
            return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().H(contextK);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$g */
    public class g implements C0746Eg1.a {
        public g() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p invoke() {
            return C2600Vw0.this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$h */
    public class h implements C9938yg1.a {
        public h() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            C2600Vw0.this.a.b(0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$i */
    public class i implements C9938yg1.a {
        public i() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            Context contextK = com.daaw.avee.a.k();
            if (contextK == null) {
                return;
            }
            AsyncTaskC7617qN0 asyncTaskC7617qN0C = AsyncTaskC7617qN0.c(contextK, new File("/storage/"), new s(), new WeakReference(C2600Vw0.this.c));
            C2600Vw0.this.a.d(asyncTaskC7617qN0C, 0);
            asyncTaskC7617qN0C.i();
            DialogFragmentC7338pN0.b();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$j */
    public class j implements C0321Ag1.a {
        public j() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str, String str2) {
            C2600Vw0.this.i(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$k */
    public class k implements C0321Ag1.a {
        public k() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(long[] jArr, List list) {
            DialogFragmentC4121du.a(jArr, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$l */
    public class l implements C0321Ag1.a {
        public l() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(long[] jArr, List list) {
            DialogFragmentC4121du.a(jArr, list);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$m */
    public class m implements C0425Bg1.a {
        public m() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(String str, long[] jArr, List list) {
            int iB;
            if (str == null || str.length() <= 0) {
                return;
            }
            Context contextH = com.daaw.avee.a.h();
            if (contextH != null && (iB = AbstractC1848Ow0.b(contextH, str, jArr)) > 0) {
                AbstractC5075hI.a.a(contextH.getResources().getQuantityString(FD0.s, iB, Integer.valueOf(iB)));
            }
            C2600Vw0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$n */
    public class n implements C0642Dg1.a {
        public n() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(String str, String str2, C1121Hw0 c1121Hw0, List list, Boolean bool) {
            Context contextH = com.daaw.avee.a.h();
            if (contextH == null) {
                return;
            }
            if (str == null || str.length() <= 0) {
                str = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(contextH), "pref_playlistDefaultPath", "\\Playlists\\");
            }
            if (str2 == null || str2.length() <= 0) {
                return;
            }
            C7378pX0 c7378pX0 = new C7378pX0();
            String strF = C1225Iw0.f(str, str2, c1121Hw0);
            int iC = C1225Iw0.h().c(c7378pX0, strF, c1121Hw0, list, bool.booleanValue());
            if (iC > 0) {
                AbstractC5075hI.a.a(contextH.getResources().getQuantityString(FD0.s, iC, Integer.valueOf(iC)));
            } else if (c7378pX0.f()) {
                AbstractC5075hI.a.a(c7378pX0.e());
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().E(contextH, strF, true);
            C2600Vw0.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$o */
    public class o implements C0321Ag1.a {
        public o() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(List list, Boolean bool) {
            DialogFragmentC1536Lw0.c(list, bool);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$p */
    public static class p {
        public String a;
        public boolean b;
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$q */
    public class q implements DialogInterface.OnClickListener {
        public List B;

        public q(List list) {
            this.B = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            C2600Vw0.this.j(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$r */
    public class r implements AsyncTaskC7617qN0.c {
        public r() {
        }

        @Override // com.daaw.AsyncTaskC7617qN0.c
        public void a(AsyncTask asyncTask, boolean z, List list) {
            if (C2600Vw0.this.a.c(asyncTask, 0)) {
                C2600Vw0.this.b.b = false;
                C2600Vw0.this.b.a = "Finished";
                DialogFragmentC7338pN0.d(C2600Vw0.this.b);
                if (!z || list == null) {
                    return;
                }
                C2600Vw0.this.l(list);
            }
        }

        @Override // com.daaw.AsyncTaskC7617qN0.c
        public void b(AsyncTask asyncTask, String str) {
            if (C2600Vw0.this.a.c(asyncTask, 0)) {
                C2600Vw0.this.b.b = true;
                C2600Vw0.this.b.a = str;
                DialogFragmentC7338pN0.d(C2600Vw0.this.b);
            }
        }

        @Override // com.daaw.AsyncTaskC7617qN0.c
        public void c(AsyncTask asyncTask) {
            if (C2600Vw0.this.a.c(asyncTask, 0)) {
                C2600Vw0.this.b.b = true;
                C2600Vw0.this.b.a = "Starting";
                DialogFragmentC7338pN0.d(C2600Vw0.this.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vw0$s */
    public static class s implements AsyncTaskC7617qN0.b {
        @Override // com.daaw.AsyncTaskC7617qN0.b
        public String a(String str) {
            return str.toLowerCase();
        }

        @Override // com.daaw.AsyncTaskC7617qN0.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String str, File file) {
            return C1121Hw0.a(AbstractC0934Gb1.i(file));
        }
    }

    public C2600Vw0() {
        DialogFragmentC7338pN0.D.b(new g(), this.d);
        DialogFragmentC7338pN0.E.b(new h(), this.d);
        FragmentC10191zb0.d0.b(new i(), this.d);
        FragmentC10191zb0.U.b(new j(), this.d);
        FragmentC10191zb0.e0.b(new k(), this.d);
        DialogFragmentC1536Lw0.M.b(new l(), this.d);
        DialogFragmentC4121du.B.b(new m(), this.d);
        DialogFragmentC4121du.C.b(new n(), this.d);
        FragmentC10191zb0.J.b(new o(), this.d);
        DialogFragmentC1536Lw0.J.b(new a(), this.d);
        DialogFragmentC1536Lw0.K.b(new b(), this.d);
        FragmentC10191zb0.V.b(new c(), this.d);
        TG0.B.b(new d(), this.d);
        FragmentC10191zb0.W.b(new e(), this.d);
        DialogFragmentC1536Lw0.L.b(new f(), this.d);
    }

    public final void i(String str, String str2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().J(str, str2);
        m();
    }

    public final void j(List list) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().F(contextK, list, true);
        m();
    }

    public final void k(Long l2) {
        Context contextI = com.daaw.avee.a.i();
        if (contextI == null) {
            return;
        }
        if (AbstractC1848Ow0.c(contextI, l2.longValue()) > 0) {
            AbstractC5075hI.a.a(contextI.getResources().getString(JD0.t4));
        }
        m();
    }

    public final void l(List list) {
        MainActivity mainActivityE1 = MainActivity.e1();
        if (mainActivityE1 == null) {
            return;
        }
        C2138Rl0 c2138Rl0H = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().H(mainActivityE1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!c2138Rl0H.v(str)) {
                arrayList.add(str);
            }
        }
        q qVar = new q(arrayList);
        int size = arrayList.size();
        String quantityString = mainActivityE1.getResources().getQuantityString(FD0.p, size, Integer.valueOf(size));
        if (mainActivityE1.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivityE1);
        builder.setTitle(JD0.a1);
        builder.setMessage(quantityString);
        builder.setPositiveButton(JD0.Z0, qVar);
        builder.create().show();
    }

    public final void m() {
        FP fpB1 = MainActivity.b1();
        if (fpB1 != null) {
            fpB1.B();
        }
    }
}
