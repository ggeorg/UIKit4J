#import "UIViewStub.h"

#import "J2ObjC_source.h"

@implementation UIView (JavaUIView)

J2OBJC_IGNORE_DESIGNATED_BEGIN

- (instancetype)initWithOrgChamomileIosCoreGraphicsCGRect:(OrgChamomileIosCoreGraphicsCGRect *)frame {
  UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(self, frame);
  return self;
}

- (instancetype)initWithDouble:(jdouble)x
                    withDouble:(jdouble)y
                    withDouble:(jdouble)width
                    withDouble:(jdouble)height {
  UIView_initWithDouble_withDouble_withDouble_withDouble_(self, x, y, width, height);
  return self;
}

J2OBJC_IGNORE_DESIGNATED_END

- (void)setFrameWithDouble:(jdouble)arg0
                withDouble:(jdouble)arg1
                withDouble:(jdouble)arg2
                withDouble:(jdouble)arg3 {
  OrgChamomileIosUikitUIView_setFrameWithDouble_withDouble_withDouble_withDouble_(self, arg0, arg1, arg2, arg3);
}
    
+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIColor;", 0x1, 2, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "D", 0x1, 7, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 8, 9, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 10, 6, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIColor;", 0x1, 11, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 4, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 13, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 14, 15, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 16, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 17, 6, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 18, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 19, 6, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIView;", 0x1, 20, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 21, 22, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 23, 6, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 24, 6, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 25, 6, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIView;", 0x1, 26, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosFoundationNSArray;", 0x1, 27, -1, -1, 28, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIWindow;", 0x1, 29, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 30, 22, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 31, 22, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 32, 22, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 33, 34, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 35, 36, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 37, 36, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 38, 39, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 40, 22, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 41, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 42, 15, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 43, 6, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 44, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 45, 15, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 46, 6, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutYAxisAnchor;", 0x1, 47, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutXAxisAnchor;", 0x1, 48, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutYAxisAnchor;", 0x1, 49, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutYAxisAnchor;", 0x1, 50, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutDimension;", 0x1, 51, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutYAxisAnchor;", 0x1, 52, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutXAxisAnchor;", 0x1, 53, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutXAxisAnchor;", 0x1, 54, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutXAxisAnchor;", 0x1, 55, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutYAxisAnchor;", 0x1, 56, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutXAxisAnchor;", 0x1, 57, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitNSLayoutDimension;", 0x1, 58, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosFoundationNSArray;", 0x1, 59, -1, -1, 60, -1, -1 },
    { NULL, "V", 0x1, 61, 62, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 63, 64, -1, 65, -1, -1 },
    { NULL, "V", 0x1, 66, 62, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 67, 64, -1, 65, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithOrgChamomileIosCoreGraphicsCGRect:);
  methods[2].selector = @selector(initWithDouble:withDouble:withDouble:withDouble:);
  methods[3].selector = @selector(backgroundColor);
  methods[4].selector = @selector(setBackgroundColor:);
  methods[5].selector = @selector(isHidden);
  methods[6].selector = @selector(setHidden:);
  methods[7].selector = @selector(alpha);
  methods[8].selector = @selector(setAlpha:);
  methods[9].selector = @selector(isOpaque);
  methods[10].selector = @selector(setOpaque:);
  methods[11].selector = @selector(tintColor);
  methods[12].selector = @selector(setTintColor:);
  methods[13].selector = @selector(tintAdjustmentMode);
  methods[14].selector = @selector(setTintAdjustmentMode:);
  methods[15].selector = @selector(clipsToBounds);
  methods[16].selector = @selector(setClipsToBounds:);
  methods[17].selector = @selector(clearsContextBeforeDrawing);
  methods[18].selector = @selector(setClearsContextBeforeDrawing:);
  methods[19].selector = @selector(maskView);
  methods[20].selector = @selector(setMaskView:);
  methods[21].selector = @selector(isUserInteractionEnabled);
  methods[22].selector = @selector(setUserInteractionEnabled:);
  methods[23].selector = @selector(isMultipleTouchEnabled);
  methods[24].selector = @selector(setMultipleTouchEnabled:);
  methods[25].selector = @selector(isExclusiveTouch);
  methods[26].selector = @selector(setExclusiveTouch:);
  methods[27].selector = @selector(superview);
  methods[28].selector = @selector(subviews);
  methods[29].selector = @selector(window);
  methods[30].selector = @selector(addSubview:);
  methods[31].selector = @selector(bringSubviewToFront:);
  methods[32].selector = @selector(sendSubviewToBack:);
  methods[33].selector = @selector(removeFromSuperview);
  methods[34].selector = @selector(insertSubview:atIndex:);
  methods[35].selector = @selector(insertSubview:aboveSubview:);
  methods[36].selector = @selector(insertSubview:belowSubview:);
  methods[37].selector = @selector(exchangeSubviewAtIndex:withSubviewAtIndex:);
  methods[38].selector = @selector(isDescendantOfView:);
  methods[39].selector = @selector(autoresizingMask);
  methods[40].selector = @selector(setAutoresizingMask:);
  methods[41].selector = @selector(autoresizesSubviews);
  methods[42].selector = @selector(setAutoresizesSubviews:);
  methods[43].selector = @selector(contentMode);
  methods[44].selector = @selector(setContentMode:);
  methods[45].selector = @selector(sizeToFit);
  methods[46].selector = @selector(layoutSubviews);
  methods[47].selector = @selector(setNeedsLayout);
  methods[48].selector = @selector(layoutIfNeeded);
  methods[49].selector = @selector(translatesAutoresizingMaskIntoConstraints);
  methods[50].selector = @selector(setTranslatesAutoresizingMaskIntoConstraints:);
  methods[51].selector = @selector(bottomAnchor);
  methods[52].selector = @selector(centerXAnchor);
  methods[53].selector = @selector(centerYAnchor);
  methods[54].selector = @selector(firstBaselineAnchor);
  methods[55].selector = @selector(heightAnchor);
  methods[56].selector = @selector(lastBaselineAnchor);
  methods[57].selector = @selector(leadingAnchor);
  methods[58].selector = @selector(leftAnchor);
  methods[59].selector = @selector(rightAnchor);
  methods[60].selector = @selector(topAnchor);
  methods[61].selector = @selector(trailingAnchor);
  methods[62].selector = @selector(widthAnchor);
  methods[63].selector = @selector(constraints);
  methods[64].selector = @selector(addConstraint:);
  methods[65].selector = @selector(addConstraints:);
  methods[66].selector = @selector(removeConstraint:);
  methods[67].selector = @selector(removeConstraints:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LOrgChamomileIosCoreGraphicsCGRect;", "DDDD", "getBackgroundColor", "setBackgroundColor", "LOrgChamomileIosUikitUIColor;", "setHidden", "Z", "getAlpha", "setAlpha", "D", "setOpaque", "getTintColor", "setTintColor", "getTintAdjustmentMode", "setTintAdjustmentMode", "I", "isClipsToBounds", "setClipsToBounds", "isClearsContextBeforeDrawing", "setClearsContextBeforeDrawing", "getMaskView", "setMaskView", "LOrgChamomileIosUikitUIView;", "setUserInteractionEnabled", "setMultipleTouchEnabled", "setExclusiveTouch", "getSuperview", "getSubviews", "()Lorg/chamomile/ios/foundation/NSArray<Lorg/chamomile/ios/uikit/UIView;>;", "getWindow", "addSubview", "bringSubviewToFront", "sendSubviewToBack", "insertSubview", "LOrgChamomileIosUikitUIView;I", "insertAboveSubview", "LOrgChamomileIosUikitUIView;LOrgChamomileIosUikitUIView;", "insertBelowSubview", "exchangeSubviews", "II", "isDescendantOfView", "getAutoresizingMask", "setAutoresizingMask", "setAutoresizesSubviews", "getContentMode", "setContentMode", "setTranslatesAutoresizingMaskIntoConstraints", "getBottomAnchor", "getCenterXAnchor", "getCenterYAnchor", "getFirstBaselineAnchor", "getHeightAnchor", "getLastBaselineAnchor", "getLeadingAnchor", "getLeftAnchor", "getRightAnchor", "getTopAnchor", "getTrailingAnchor", "getWidthAnchor", "getConstraints", "()Lorg/chamomile/ios/foundation/NSArray<Lorg/chamomile/ios/uikit/NSLayoutConstraint;>;", "addConstraint", "LOrgChamomileIosUikitNSLayoutConstraint;", "addConstraints", "LOrgChamomileIosFoundationNSArray;", "(Lorg/chamomile/ios/foundation/NSArray<Lorg/chamomile/ios/uikit/NSLayoutConstraint;>;)V", "removeConstraint", "removeConstraints" };
  static const J2ObjcClassInfo _UIView = { "UIViewStub2", "org.chamomile.ios.uikit", ptrTable, methods, NULL, 7, 0x1, 68, 0, -1, -1, -1, -1, -1 };
  return &_UIView;
}

#include "UIViewStubImpl.h"

@end

void UIView_init(UIView *self) {
  static IMP initImp;
  static dispatch_once_t token;
  dispatch_once(&token, ^{
    initImp = [UIView instanceMethodForSelector:@selector(init)];
  });
  ((id (*)(id, SEL))initImp)(self, @selector(init));
}

UIView *new_UIView_init() {
  J2OBJC_NEW_IMPL(UIView, init)
}

UIView *create_UIView_init() {
  J2OBJC_CREATE_IMPL(UIView, init)
}

void UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(UIView *self, OrgChamomileIosCoreGraphicsCGRect *frame) {
  UIView_initWithDouble_withDouble_withDouble_withDouble_(self, ((OrgChamomileIosCoreGraphicsCGPoint *) nil_chk(((OrgChamomileIosCoreGraphicsCGRect *) nil_chk(frame))->origin_))->x_, frame->origin_->y_, ((OrgChamomileIosCoreGraphicsCGSize *) nil_chk(frame->size_))->width_, frame->size_->height_);
}

UIView *new_UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(OrgChamomileIosCoreGraphicsCGRect *frame) {
  J2OBJC_NEW_IMPL(UIView, initWithOrgChamomileIosCoreGraphicsCGRect_, frame)
}

UIView *create_UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(OrgChamomileIosCoreGraphicsCGRect *frame) {
  J2OBJC_CREATE_IMPL(UIView, initWithOrgChamomileIosCoreGraphicsCGRect_, frame)
}

void UIView_initWithDouble_withDouble_withDouble_withDouble_(UIView *self, jdouble x, jdouble y, jdouble width, jdouble height) {
  [self initWithFrame:CGRectMake((CGFloat)x, (CGFloat)y, (CGFloat)width, (CGFloat)height)];
}

UIView *new_UIView_initWithDouble_withDouble_withDouble_withDouble_(jdouble x, jdouble y, jdouble width, jdouble height) {
  J2OBJC_NEW_IMPL(UIView, initWithDouble_withDouble_withDouble_withDouble_, x, y, width, height)
}

UIView *create_UIView_initWithDouble_withDouble_withDouble_withDouble_(jdouble x, jdouble y, jdouble width, jdouble height) {
  J2OBJC_CREATE_IMPL(UIView, initWithDouble_withDouble_withDouble_withDouble_, x, y, width, height)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UIView)

// Empty class to force category to be loaded.
@implementation JavaUIViewCategoryDummy
@end
