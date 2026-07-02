package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.LO1;
import com.daaw.MO1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ReportingInfo {
    public final MO1 a;

    public static final class Builder {
        public final LO1 a;

        public Builder(View view) {
            LO1 lo1 = new LO1();
            this.a = lo1;
            lo1.b(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.a.c(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.a = new MO1(builder.a);
    }

    public void recordClick(List<Uri> list) {
        this.a.a(list);
    }

    public void recordImpression(List<Uri> list) {
        this.a.b(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.a.c(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.a.d(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.a.e(list, updateImpressionUrlsCallback);
    }
}
