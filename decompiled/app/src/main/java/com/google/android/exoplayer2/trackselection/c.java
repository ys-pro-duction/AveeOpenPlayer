package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {
        c a(TrackGroup trackGroup, int... iArr);
    }

    TrackGroup a();

    int b();

    boolean c(int i, long j);

    Format d(int i);

    void e();

    void f();

    int g(int i);

    int h(long j, List list);

    int i(Format format);

    int j();

    Format k();

    int l();

    int length();

    void m(float f);

    void n(long j, long j2, long j3);

    Object o();

    int p(int i);
}
