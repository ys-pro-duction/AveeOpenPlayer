package com.daaw;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class QZ {
    public final c a;

    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public QZ(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static QZ f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new QZ(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.a();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.c();
    }

    public void d() {
        this.a.b();
    }

    public Object e() {
        return this.a.d();
    }

    public static final class a implements c {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // com.daaw.QZ.c
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override // com.daaw.QZ.c
        public void b() {
            this.a.requestPermission();
        }

        @Override // com.daaw.QZ.c
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override // com.daaw.QZ.c
        public Object d() {
            return this.a;
        }

        @Override // com.daaw.QZ.c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public QZ(c cVar) {
        this.a = cVar;
    }

    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // com.daaw.QZ.c
        public Uri a() {
            return this.a;
        }

        @Override // com.daaw.QZ.c
        public Uri c() {
            return this.c;
        }

        @Override // com.daaw.QZ.c
        public Object d() {
            return null;
        }

        @Override // com.daaw.QZ.c
        public ClipDescription getDescription() {
            return this.b;
        }

        @Override // com.daaw.QZ.c
        public void b() {
        }
    }
}
