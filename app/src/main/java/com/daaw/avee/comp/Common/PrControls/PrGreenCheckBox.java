package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.AbstractC2916Yx0;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.G10;
import com.daaw.avee.comp.Common.PrControls.PrGreenCheckBox;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/daaw/G91;", "c", "()V", "", "", "F", "Ljava/util/List;", "listenerRefHolder", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "a", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrGreenCheckBox extends AppCompatCheckBox {
    public static final int H = 8;
    public static final C0746Eg1 I = new C0746Eg1();

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final List listenerRefHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrGreenCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G10.g(context, "context");
        this.listenerRefHolder = new LinkedList();
        c();
    }

    public static final Boolean d(PrGreenCheckBox prGreenCheckBox, Integer num) {
        G10.g(prGreenCheckBox, "this$0");
        int id = prGreenCheckBox.getId();
        if (num == null || num.intValue() != id) {
            return Boolean.FALSE;
        }
        prGreenCheckBox.setEnabled(true);
        prGreenCheckBox.setChecked(true);
        return Boolean.TRUE;
    }

    public final void c() {
        C0746Eg1 c0746Eg1 = AbstractC2916Yx0.e;
        Boolean bool = Boolean.FALSE;
        Object objA = c0746Eg1.a(bool);
        G10.f(objA, "invoke(...)");
        if (((Boolean) objA).booleanValue()) {
            setEnabled(true);
            return;
        }
        AbstractC2916Yx0.d.b(new C0850Fg1.a() { // from class: com.daaw.Xx0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return PrGreenCheckBox.d(this.a, (Integer) obj);
            }
        }, this.listenerRefHolder);
        Object objA2 = AbstractC2916Yx0.c.a(Integer.valueOf(getId()), bool);
        G10.f(objA2, "invoke(...)");
        setEnabled(((Boolean) objA2).booleanValue());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        G10.g(event, "event");
        if (event.getActionMasked() != 0 && event.getActionMasked() != 5) {
            return super.onTouchEvent(event);
        }
        if (isChecked()) {
            setChecked(false);
        } else if (isEnabled()) {
            setChecked(true);
        } else {
            Object objA = AbstractC2916Yx0.b.a(Integer.valueOf(getId()), Boolean.FALSE);
            G10.f(objA, "invoke(...)");
            if (((Boolean) objA).booleanValue()) {
                setEnabled(true);
                setChecked(true);
            }
        }
        return true;
    }
}
