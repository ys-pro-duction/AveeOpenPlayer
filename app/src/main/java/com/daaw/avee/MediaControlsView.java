package com.daaw.avee;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC9815yD0;
import com.daaw.C0425Bg1;
import com.daaw.G10;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/daaw/avee/MediaControlsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/Configuration;", "newConfig", "Lcom/daaw/G91;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "b", "()V", "c", "B", "a", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MediaControlsView extends FrameLayout {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final C0425Bg1 C = new C0425Bg1();

    /* JADX INFO: renamed from: com.daaw.avee.MediaControlsView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C0425Bg1 a() {
            return MediaControlsView.C;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        G10.g(context, "context");
    }

    public final void b() {
        View.inflate(getContext(), AbstractC9815yD0.s0, this);
        C.a(findViewById(AbstractC5056hD0.F1), findViewById(AbstractC5056hD0.H1), findViewById(AbstractC5056hD0.G1));
    }

    public final void c() {
        removeAllViews();
        b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        c();
    }

    public /* synthetic */ MediaControlsView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G10.g(context, "context");
        b();
    }
}
