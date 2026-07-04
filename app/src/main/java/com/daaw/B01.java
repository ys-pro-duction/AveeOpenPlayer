package com.daaw;

import android.app.job.JobInfo;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B01 {
    public static /* synthetic */ JobInfo.TriggerContentUri a(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }
}
