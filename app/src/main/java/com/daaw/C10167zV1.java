package com.daaw;

import j$.util.DesugarCollections;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.zV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10167zV1 extends AbstractC9330wV1 {
    public static final Set G = DesugarCollections.synchronizedSet(new HashSet());
    public static final DecimalFormat H = new DecimalFormat("#,###");
    public File E;
    public boolean F;

    public C10167zV1(FU1 fu1) {
        super(fu1);
        File cacheDir = this.B.getCacheDir();
        if (cacheDir == null) {
            AbstractC4274eT1.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.E = file;
        if (!file.isDirectory() && !this.E.mkdirs()) {
            AbstractC4274eT1.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.E.getAbsolutePath())));
            this.E = null;
        } else {
            if (this.E.setReadable(true, false) && this.E.setExecutable(true, false)) {
                return;
            }
            AbstractC4274eT1.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.E.getAbsolutePath())));
            this.E = null;
        }
    }

    @Override // com.daaw.AbstractC9330wV1
    public final void k() {
        this.F = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cf  */
    @Override // com.daaw.AbstractC9330wV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(final java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10167zV1.v(java.lang.String):boolean");
    }

    public final File y(File file) {
        return new File(this.E, String.valueOf(file.getName()).concat(".done"));
    }
}
