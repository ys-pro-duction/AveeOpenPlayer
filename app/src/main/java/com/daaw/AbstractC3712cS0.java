package com.daaw;

import android.content.Context;
import com.daaw.AbstractAsyncTaskC5893kD;
import com.daaw.AsyncTaskC2517Vb1;
import com.daaw.C2138Rl0;
import com.daaw.C3991dS0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.cS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3712cS0 {

    /* JADX INFO: renamed from: com.daaw.cS0$a */
    public class a implements AsyncTaskC2517Vb1.c {
        @Override // com.daaw.AsyncTaskC2517Vb1.c
        public Object a(AsyncTaskC2517Vb1 asyncTaskC2517Vb1) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cS0$b */
    public class b implements AsyncTaskC2517Vb1.c {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ GQ d;
        public final /* synthetic */ String e;

        /* JADX INFO: renamed from: com.daaw.cS0$b$a */
        public class a implements AbstractAsyncTaskC5893kD.a {
            public a() {
            }

            @Override // com.daaw.AbstractAsyncTaskC5893kD.a
            public FileOutputStream a() {
                return new FileOutputStream(new File(b.this.a.getCacheDir(), b.this.b));
            }
        }

        /* JADX INFO: renamed from: com.daaw.cS0$b$b, reason: collision with other inner class name */
        public class C0159b implements KQ {
            public final /* synthetic */ AsyncTaskC2517Vb1 a;

            public C0159b(AsyncTaskC2517Vb1 asyncTaskC2517Vb1) {
                this.a = asyncTaskC2517Vb1;
            }

            @Override // com.daaw.KQ
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean a() {
                return Boolean.valueOf(this.a.isCancelled());
            }
        }

        public b(Context context, String str, long j, GQ gq, String str2) {
            this.a = context;
            this.b = str;
            this.c = j;
            this.d = gq;
            this.e = str2;
        }

        @Override // com.daaw.AsyncTaskC2517Vb1.c
        public Object a(AsyncTaskC2517Vb1 asyncTaskC2517Vb1) throws Throwable {
            Boolean[] boolArr = {Boolean.FALSE};
            File file = new File(this.a.getCacheDir(), this.b);
            if (file.lastModified() + this.c > System.currentTimeMillis()) {
                Object objA = this.d.a(file, boolArr);
                if (boolArr[0].booleanValue()) {
                    AbstractC0441Bk1.a("returning cached file");
                    return objA;
                }
            }
            AbstractAsyncTaskC5893kD.a(this.e, new a(), new C0159b(asyncTaskC2517Vb1), null);
            return this.d.a(new File(this.a.getCacheDir(), this.b), boolArr);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cS0$c */
    public class c implements C3991dS0.c {
        @Override // com.daaw.C3991dS0.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C7914rS a(String str, String str2) {
            return new C7914rS(str, str2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cS0$d */
    public class d implements FQ {
        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(C7914rS c7914rS) {
            return c7914rS != null ? c7914rS.a() : new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.daaw.cS0$e */
    public class e implements C3991dS0.d {
        @Override // com.daaw.C3991dS0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B61 a(String str, String str2, int i, String str3, String str4, String[] strArr) {
            return new B61(null, new C3434bS0(str, str2, i, str3, str4, strArr));
        }
    }

    /* JADX INFO: renamed from: com.daaw.cS0$f */
    public class f implements FQ {
        public final /* synthetic */ String a;

        public f(String str) {
            this.a = str;
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(B61 b61) {
            Object obj;
            String str = this.a;
            if (str == null || (obj = b61.a) == null) {
                return null;
            }
            C7914rS c7914rSA = AbstractC3712cS0.a(str, (List) obj);
            return c7914rSA != null ? c7914rSA.a : ".....";
        }
    }

    /* JADX INFO: renamed from: com.daaw.cS0$g */
    public class g implements FQ {
        public final /* synthetic */ String a;

        public g(String str) {
            this.a = str;
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B61 a(B61 b61) {
            List listB = AbstractC3712cS0.b(this.a, (List) b61.a);
            if (listB == null || listB.size() == 0) {
                listB = new ArrayList();
                C7914rS c7914rSA = AbstractC3712cS0.a(this.a, (List) b61.a);
                if (c7914rSA != null) {
                    listB.add(c7914rSA);
                }
            }
            return new B61(listB, (C7378pX0) b61.b);
        }
    }

    public static C7914rS a(String str, List list) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(((C7914rS) list.get(i)).b)) {
                    return (C7914rS) list.get(i);
                }
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                C7914rS c7914rSA = a(str, ((C7914rS) list.get(i2)).a());
                if (c7914rSA != null) {
                    return c7914rSA;
                }
            }
        }
        return null;
    }

    public static List b(String str, List list) {
        if (list == null) {
            return null;
        }
        if (str != null && str.length() != 0 && !str.equals("0")) {
            for (int i = 0; i < list.size(); i++) {
                if (str.equals(((C7914rS) list.get(i)).b)) {
                    return ((C7914rS) list.get(i)).a();
                }
            }
        }
        return list;
    }

    public static HX c(String str) {
        return new C2725Xb1(e().e("0"), new g(str));
    }

    public static HX d(String str, String str2) {
        return new C2725Xb1(e().e("0"), new f(str2));
    }

    public static C3155aS0 e() {
        return C3155aS0.d("shoutcast_com_yp", new c(), new d(), new e(), new C2138Rl0.a());
    }

    public static String f() {
        return AbstractC3286au.a("zC0wX0Pwb5nJy7o2");
    }

    public static AsyncTaskC2517Vb1 g(String str, String str2, GQ gq, int i) {
        Context contextI = com.daaw.avee.a.i();
        return contextI == null ? new AsyncTaskC2517Vb1(new a()) : new AsyncTaskC2517Vb1(new b(contextI, str2, ((long) i) * 60000, gq, str));
    }
}
