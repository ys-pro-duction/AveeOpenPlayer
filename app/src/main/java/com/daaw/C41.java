package com.daaw;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class C41 extends L41 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C41(Context context) {
        G10.g(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC8937v41.a());
        G10.f(systemService, "context.getSystemService…opicsManager::class.java)");
        super(AbstractC9216w41.a(systemService));
    }

    @Override // com.daaw.L41
    public GetTopicsRequest c(C9595xS c9595xS) {
        G10.g(c9595xS, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC9774y41.a().setAdsSdkName(c9595xS.a()).setShouldRecordObservation(c9595xS.b()).build();
        G10.f(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
