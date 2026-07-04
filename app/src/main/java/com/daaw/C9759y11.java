package com.daaw;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.y11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9759y11 implements Iterable {
    public final ArrayList B = new ArrayList();
    public final Context C;

    /* JADX INFO: renamed from: com.daaw.y11$a */
    public interface a {
        Intent m();
    }

    public C9759y11(Context context) {
        this.C = context;
    }

    public static C9759y11 q(Context context) {
        return new C9759y11(context);
    }

    public C9759y11 e(Intent intent) {
        this.B.add(intent);
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.B.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9759y11 m(Activity activity) {
        Intent intentM = activity instanceof a ? ((a) activity).m() : null;
        if (intentM == null) {
            intentM = AbstractC6339ln0.a(activity);
        }
        if (intentM != null) {
            ComponentName component = intentM.getComponent();
            if (component == null) {
                component = intentM.resolveActivity(this.C.getPackageManager());
            }
            p(component);
            e(intentM);
        }
        return this;
    }

    public C9759y11 p(ComponentName componentName) {
        int size = this.B.size();
        try {
            Intent intentB = AbstractC6339ln0.b(this.C, componentName);
            while (intentB != null) {
                this.B.add(size, intentB);
                intentB = AbstractC6339ln0.b(this.C, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void s() {
        v(null);
    }

    public void v(Bundle bundle) {
        if (this.B.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.B.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (AbstractC9438ws.i(this.C, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.C.startActivity(intent);
    }
}
