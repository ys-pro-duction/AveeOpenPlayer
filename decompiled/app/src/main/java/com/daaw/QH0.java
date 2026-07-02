package com.daaw;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class QH0 {
    public static final QH0 a = new QH0();

    public final int a(RenderNode renderNode) {
        G10.g(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        G10.g(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i) {
        G10.g(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    public final void d(RenderNode renderNode, int i) {
        G10.g(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
