package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC2916Yx0;
import com.daaw.AbstractC3374bD0;
import com.daaw.AbstractC4781gE0;
import com.daaw.C9797y9;
import com.daaw.G10;
import com.daaw.avee.comp.Common.View.AdIcon;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/daaw/avee/comp/Common/View/AdIcon;", "Lcom/daaw/y9;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "E", "I", "getTargetId", "()I", "setTargetId", "(I)V", "targetId", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AdIcon extends C9797y9 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int targetId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        G10.g(context, "context");
    }

    public static final void d(AdIcon adIcon, View view) {
        G10.g(adIcon, "this$0");
        AbstractC2916Yx0.b.a(Integer.valueOf(adIcon.targetId), Boolean.FALSE);
    }

    public final int getTargetId() {
        return this.targetId;
    }

    public final void setTargetId(int i) {
        this.targetId = i;
    }

    public /* synthetic */ AdIcon(Context context, AttributeSet attributeSet, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G10.g(context, "context");
        this.targetId = -1;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC4781gE0.a, 0, 0);
        G10.f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(AbstractC4781gE0.c, true);
        this.targetId = typedArrayObtainStyledAttributes.getResourceId(AbstractC4781gE0.b, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!z && !((Boolean) AbstractC2916Yx0.e.a(Boolean.TRUE)).booleanValue()) {
            setImageResource(AbstractC3374bD0.r);
            setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Q2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdIcon.d(this.B, view);
                }
            });
        } else {
            setVisibility(8);
        }
    }
}
