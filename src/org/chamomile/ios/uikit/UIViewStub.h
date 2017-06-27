#ifndef _OrgChamomileIosUikitUIViewStub_H_
#define _OrgChamomileIosUikitUIViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIView.h"

@interface UIView (JavaUIView) <OrgChamomileIosUikitUIView>

#pragma mark Public

- (instancetype)initWithOrgChamomileIosCoreGraphicsCGRect:(OrgChamomileIosCoreGraphicsCGRect *)frame;

- (instancetype)initWithDouble:(jdouble)x
                    withDouble:(jdouble)y
                    withDouble:(jdouble)width
                    withDouble:(jdouble)height;

@end

J2OBJC_EMPTY_STATIC_INIT(UIView)

FOUNDATION_EXPORT void UIView_init(UIView *self);

FOUNDATION_EXPORT UIView *new_UIView_init() NS_RETURNS_RETAINED;

FOUNDATION_EXPORT UIView *create_UIView_init();

FOUNDATION_EXPORT void UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(UIView *self, OrgChamomileIosCoreGraphicsCGRect *frame);

FOUNDATION_EXPORT UIView *new_UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(OrgChamomileIosCoreGraphicsCGRect *frame) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT UIView *create_UIView_initWithOrgChamomileIosCoreGraphicsCGRect_(OrgChamomileIosCoreGraphicsCGRect *frame);

FOUNDATION_EXPORT void UIView_initWithDouble_withDouble_withDouble_withDouble_(UIView *self, jdouble x, jdouble y, jdouble width, jdouble height);

FOUNDATION_EXPORT UIView *new_UIView_initWithDouble_withDouble_withDouble_withDouble_(jdouble x, jdouble y, jdouble width, jdouble height) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT UIView *create_UIView_initWithDouble_withDouble_withDouble_withDouble_(jdouble x, jdouble y, jdouble width, jdouble height);

J2OBJC_TYPE_LITERAL_HEADER(UIView)

// Empty class to force category to be loaded.
@interface JavaUIViewCategoryDummy : UIView
@end

#endif // _OrgChamomileIosUikitUIViewStub_H_