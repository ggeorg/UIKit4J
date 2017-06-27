#ifndef _OrgChamomileIosUikitUIViewControllerStub_H_
#define _OrgChamomileIosUikitUIViewControllerStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIViewController.h"

@interface UIViewController (JavaUIViewController) <OrgChamomileIosUikitUIViewController>

@end

J2OBJC_EMPTY_STATIC_INIT(UIViewController)

FOUNDATION_EXPORT void UIViewController_init(UIViewController *self);

FOUNDATION_EXPORT UIViewController *new_UIViewController_init() NS_RETURNS_RETAINED;

FOUNDATION_EXPORT UIViewController *create_UIViewController_init();

J2OBJC_TYPE_LITERAL_HEADER(UIViewController)

// Empty class to force category to be loaded.
@interface JavaUIViewControllerCategoryDummy : UIViewController
@end

#endif // _OrgChamomileIosUikitUIViewControllerStub_H_
