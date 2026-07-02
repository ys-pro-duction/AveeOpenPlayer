package com.daaw;

import android.content.Context;
import com.daaw.AbstractC5607jC;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.f10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4431f10 extends AbstractC5607jC {

    /* JADX INFO: renamed from: com.daaw.f10$a */
    public class a implements AbstractC5607jC.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // com.daaw.AbstractC5607jC.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public C4431f10(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C4431f10(Context context, String str, int i) {
        super(new a(context, str), i);
    }
}
