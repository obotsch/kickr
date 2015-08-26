var Content = React.createClass({
  render: function() {
    var Navbar = ReactBootstrap.Navbar;
    var Nav = ReactBootstrap.Nav;
    var NavItem = ReactBootstrap.NavItem;
    return (
        <Navbar brand='kickr' inverse>
            <Nav>
              <NavItem eventKey={1} href='#'>Link</NavItem>
              <NavItem eventKey={2} href='#'>Link</NavItem>
            </Nav>
          </Navbar>
    );
  }
});

React.render(<Content />, document.getElementById('content'));