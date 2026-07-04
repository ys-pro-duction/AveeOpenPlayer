package com.daaw;

import java.io.File;

/* JADX INFO: renamed from: com.daaw.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8235sc extends AbstractC2899Yt {
    public final AbstractC1316Jt a;
    public final String b;
    public final File c;

    public C8235sc(AbstractC1316Jt abstractC1316Jt, String str, File file) {
        if (abstractC1316Jt == null) {
            throw new NullPointerException("Null report");
        }
        this.a = abstractC1316Jt;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file;
    }

    @Override // com.daaw.AbstractC2899Yt
    public AbstractC1316Jt b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC2899Yt
    public File c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC2899Yt
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2899Yt) {
            AbstractC2899Yt abstractC2899Yt = (AbstractC2899Yt) obj;
            if (this.a.equals(abstractC2899Yt.b()) && this.b.equals(abstractC2899Yt.d()) && this.c.equals(abstractC2899Yt.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
