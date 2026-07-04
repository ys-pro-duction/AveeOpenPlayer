package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.daaw.C2078Qw0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2078Qw0 {
    public static final String e;
    public static final List f;
    public static final List g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final C2078Qw0 k;
    public static String l;
    public static String m;
    public Uri a;
    public String b;
    public volatile b c;
    public volatile a d;

    /* JADX INFO: renamed from: com.daaw.Qw0$a */
    public class a {
        public final d a;
        public final Object b;
        public final Object c;

        public a(d dVar, Object obj, Object obj2) {
            this.a = dVar;
            this.b = obj;
            this.c = obj2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qw0$b */
    public static class b {
        public static final Uri r = Uri.parse("content://media/external/audio/albumart");
        public final Uri a;
        public String b;
        public boolean c = false;
        public long d = 0;
        public String e = "";
        public String f = "";
        public long g = 0;
        public String h = "";
        public long i = -1;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public long p = 0;
        public String q = "";

        public b(Uri uri) {
            this.a = uri;
        }

        public static boolean j(Uri uri) {
            return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
        }

        public void a(ContentResolver contentResolver) {
            this.q = "";
            if (contentResolver == null || !E3.a) {
                return;
            }
            Cursor cursorE = AbstractC2022Qi0.e(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_art"}, "_id=?", new String[]{String.valueOf(this.g)}, null);
            if (cursorE != null && cursorE.moveToFirst()) {
                this.q = cursorE.getString(cursorE.getColumnIndex("album_art"));
            }
            if (cursorE != null) {
                cursorE.close();
            }
        }

        public String b() {
            if (h() && this.h.length() > 1) {
                return this.h;
            }
            int iIndexOf = this.e.indexOf(45);
            if (iIndexOf < 3) {
                iIndexOf = this.e.indexOf("_-_");
            }
            if (iIndexOf < 3) {
                iIndexOf = this.e.indexOf(32) >= 0 ? this.e.indexOf(95) : this.e.indexOf("__");
            }
            if (iIndexOf < 3) {
                return this.e;
            }
            if (this.e.charAt(iIndexOf - 1) == ' ') {
                iIndexOf--;
            }
            return this.e.substring(0, iIndexOf);
        }

        public String c() {
            if (this.d <= 0) {
                return null;
            }
            return "content://media/external/audio/media/" + this.d + "/albumart";
        }

        public String d() {
            String strE = e();
            return (strE == null || strE.length() <= 0) ? c() : strE;
        }

        public String e() {
            return this.q;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int f() {
            return this.j / 1000;
        }

        public boolean g() {
            return this.i > 0;
        }

        public boolean h() {
            return this.i > 0;
        }

        public boolean i() {
            return h() || this.i == -2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qw0$c */
    public static class c {
        public final b a;
        public boolean b = false;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public String p;

        public c(b bVar) {
            this.a = bVar;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qw0$d */
    public interface d {
        void a(b bVar, Object obj, Object obj2);
    }

    static {
        boolean z = AbstractC0405Bb1.a;
        e = "duration";
        f = Arrays.asList("_id", "artist", "album", "title", "duration", "mime_type");
        g = Arrays.asList("album_id", "artist_id");
        Uri uri = Uri.EMPTY;
        b bVar = new b(uri);
        h = bVar;
        i = new b(uri);
        j = new b(uri);
        k = new C2078Qw0(bVar);
        l = null;
        m = null;
    }

    public C2078Qw0(b bVar) {
        this.a = Uri.EMPTY;
        this.d = null;
        this.c = bVar;
    }

    public static boolean c(b bVar, Context context, Uri uri) {
        c cVarD = AbstractC2392Tw0.d(context, uri, null);
        if (cVarD.e.isEmpty()) {
            return false;
        }
        bVar.c = cVarD.b;
        bVar.e = cVarD.e;
        bVar.f = cVarD.h.isEmpty() ? m : cVarD.f;
        bVar.h = cVarD.g.isEmpty() ? l : cVarD.g;
        bVar.j = cVarD.i;
        bVar.m = cVarD.l;
        bVar.n = cVarD.m;
        bVar.o = cVarD.n;
        return true;
    }

    public static String[] f(boolean z) {
        ArrayList arrayList = new ArrayList(f);
        if (z) {
            arrayList.addAll(g);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean o(Uri uri, ContentResolver contentResolver) {
        String mimeTypeFromExtension;
        if (Uri.EMPTY.equals(uri)) {
            return false;
        }
        if (!"content".equals(uri.getScheme())) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            if (fileExtensionFromUrl == null) {
                return false;
            }
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        } else {
            if (com.daaw.avee.a.k() == null) {
                return false;
            }
            mimeTypeFromExtension = contentResolver.getType(uri);
        }
        if (mimeTypeFromExtension == null) {
            return false;
        }
        return mimeTypeFromExtension.startsWith("audio");
    }

    public static List q(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2078Qw0(-1L, (String) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C2078Qw0.b a(android.content.Context r21, android.net.Uri r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2078Qw0.a(android.content.Context, android.net.Uri, java.lang.String):com.daaw.Qw0$b");
    }

    public final b b(Context context, Uri uri, String str) {
        return a(context, uri, str);
    }

    public boolean d(C2078Qw0 c2078Qw0) {
        return c2078Qw0 != null && c2078Qw0.a.equals(this.a);
    }

    public b e(Object... objArr) {
        return b((Context) objArr[0], (Uri) objArr[1], (String) objArr[2]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2078Qw0) && d((C2078Qw0) obj);
    }

    public String g() {
        return Uri.decode(this.a.toString());
    }

    public b h() {
        b bVar = this.c;
        if (bVar == i) {
            this.d = null;
            s(null);
            return h;
        }
        if (bVar == j) {
            this.d = null;
            return h;
        }
        this.d = null;
        return bVar;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public b i(Handler handler, d dVar, Object obj, Object obj2) {
        b bVar = this.c;
        if (bVar == i) {
            this.d = new a(dVar, obj, obj2);
            s(handler);
            return h;
        }
        if (bVar == j) {
            this.d = new a(dVar, obj, obj2);
            return h;
        }
        this.d = null;
        return bVar;
    }

    public b j(Context context) {
        b bVar = this.c;
        return (bVar == h || bVar == j || bVar == i) ? b(context, this.a, this.b) : bVar;
    }

    public c k(Context context) {
        return AbstractC2392Tw0.d(context, this.a, j(context));
    }

    public long l() {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return 0L;
        }
        long j2 = j(contextK).d;
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    public String m() {
        return Uri.decode(this.a.toString());
    }

    public InterfaceC7377pX n() {
        return new C7430pi0(this.a);
    }

    public boolean p() {
        return b.j(this.a);
    }

    public void r(b bVar) {
        a aVar = this.d;
        this.d = null;
        this.c = bVar;
        if (aVar != null) {
            aVar.a.a(this.c, aVar.b, aVar.c);
        }
    }

    public final void s(Handler handler) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        this.c = j;
        AbstractC2392Tw0.c(contextK, this, this.a, this.b, handler, new InterfaceC5559j2() { // from class: com.daaw.Pw0
            @Override // com.daaw.InterfaceC5559j2
            public final void a(Object obj) {
                this.a.r((C2078Qw0.b) obj);
            }
        });
    }

    public C2078Qw0(Uri uri) {
        this(uri, (String) null);
    }

    public C2078Qw0(String str) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), (String) null);
    }

    public C2078Qw0(long j2, Uri uri) {
        this(uri, (String) null);
    }

    public C2078Qw0(File file) {
        this(Uri.fromFile(file), (String) null);
    }

    public C2078Qw0(long j2, String str) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), (String) null);
    }

    public C2078Qw0(long j2, String str, String str2, String str3) {
        this(str == null ? Uri.EMPTY : Uri.parse(str), str2);
    }

    public C2078Qw0(Uri uri, String str) {
        Uri uri2 = Uri.EMPTY;
        this.a = uri2;
        this.d = null;
        this.a = uri == null ? uri2 : uri;
        this.b = str;
        this.c = i;
    }
}
