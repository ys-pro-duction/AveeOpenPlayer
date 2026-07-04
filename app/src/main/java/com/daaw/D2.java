package com.daaw;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* JADX INFO: loaded from: classes.dex */
public final class D2 extends B2 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    @Override // com.daaw.B2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        G10.g(context, "context");
        G10.g(intent, "input");
        return intent;
    }

    @Override // com.daaw.B2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
