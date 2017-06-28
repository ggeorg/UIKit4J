#ifndef _OrgChamomileIosUikitUISplitViewControllerStub_H_
#define _OrgChamomileIosUikitUISplitViewControllerStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UISplitViewController.h"

@interface UISplitViewController (JavaUISplitViewController) <OrgChamomileIosUikitUISplitViewController>

@end

J2OBJC_EMPTY_STATIC_INIT(UISplitViewController)

FOUNDATION_EXPORT void UISplitViewController_init(UISplitViewController *self);

FOUNDATION_EXPORT UISplitViewController *new_UISplitViewController_init() NS_RETURNS_RETAINED;

FOUNDATION_EXPORT UISplitViewController *create_UISplitViewController_init();

J2OBJC_TYPE_LITERAL_HEADER(UISplitViewController)

// Empty class to force category to be loaded.
@interface JavaUISplitViewControllerCategoryDummy : UISplitViewController
@end

#endif // _OrgChamomileIosUikitUISplitViewControllerStub_H_
