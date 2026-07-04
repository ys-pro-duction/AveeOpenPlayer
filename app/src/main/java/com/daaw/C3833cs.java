package com.daaw;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3833cs {
    public final f a;

    /* JADX INFO: renamed from: com.daaw.cs$a */
    public static final class a {
        public final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        public C3833cs a() {
            return this.a.a();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.a.c(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.b(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cs$b */
    public static final class b implements c {
        public final ContentInfo.Builder a;

        public b(ClipData clipData, int i) {
            this.a = AbstractC4679fs.a(clipData, i);
        }

        @Override // com.daaw.C3833cs.c
        public C3833cs a() {
            return new C3833cs(new e(this.a.build()));
        }

        @Override // com.daaw.C3833cs.c
        public void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // com.daaw.C3833cs.c
        public void c(int i) {
            this.a.setFlags(i);
        }

        @Override // com.daaw.C3833cs.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: com.daaw.cs$c */
    public interface c {
        C3833cs a();

        void b(Uri uri);

        void c(int i);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: com.daaw.cs$d */
    public static final class d implements c {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // com.daaw.C3833cs.c
        public C3833cs a() {
            return new C3833cs(new g(this));
        }

        @Override // com.daaw.C3833cs.c
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // com.daaw.C3833cs.c
        public void c(int i) {
            this.c = i;
        }

        @Override // com.daaw.C3833cs.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* JADX INFO: renamed from: com.daaw.cs$e */
    public static final class e implements f {
        public final ContentInfo a;

        public e(ContentInfo contentInfo) {
            this.a = AbstractC3555bs.a(AbstractC8621ty0.g(contentInfo));
        }

        @Override // com.daaw.C3833cs.f
        public ClipData a() {
            return this.a.getClip();
        }

        @Override // com.daaw.C3833cs.f
        public int b() {
            return this.a.getFlags();
        }

        @Override // com.daaw.C3833cs.f
        public ContentInfo c() {
            return this.a;
        }

        @Override // com.daaw.C3833cs.f
        public int j() {
            return this.a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* JADX INFO: renamed from: com.daaw.cs$f */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int j();
    }

    /* JADX INFO: renamed from: com.daaw.cs$g */
    public static final class g implements f {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
            this.a = (ClipData) AbstractC8621ty0.g(dVar.a);
            this.b = AbstractC8621ty0.c(dVar.b, 0, 5, "source");
            this.c = AbstractC8621ty0.f(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // com.daaw.C3833cs.f
        public ClipData a() {
            return this.a;
        }

        @Override // com.daaw.C3833cs.f
        public int b() {
            return this.c;
        }

        @Override // com.daaw.C3833cs.f
        public ContentInfo c() {
            return null;
        }

        @Override // com.daaw.C3833cs.f
        public int j() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(C3833cs.e(this.b));
            sb.append(", flags=");
            sb.append(C3833cs.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public C3833cs(f fVar) {
        this.a = fVar;
    }

    public static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C3833cs g(ContentInfo contentInfo) {
        return new C3833cs(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.a();
    }

    public int c() {
        return this.a.b();
    }

    public int d() {
        return this.a.j();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.a.c();
        Objects.requireNonNull(contentInfoC);
        return AbstractC3555bs.a(contentInfoC);
    }

    public String toString() {
        return this.a.toString();
    }
}
