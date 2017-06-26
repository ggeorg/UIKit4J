#ifndef _OrgChamomileIosUikitUIResponderStub_H_
#define _OrgChamomileIosUikitUIResponderStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIResponder.h"

@interface UIResponder (JavaUIResponder) <OrgChamomileIosUikitUIResponder>
@end

__attribute__((always_inline)) inline void UIResponder_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIResponder)

J2OBJC_TYPE_LITERAL_HEADER(UIResponder)

// Empty class to force category to be loaded.
@interface JavaUIResponderCategoryDummy : UIResponder
@end

#endif // _OrgChamomileIosUikitUIResponderStub_H_