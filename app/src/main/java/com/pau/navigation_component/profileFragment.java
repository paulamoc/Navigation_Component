package com.pau.navigation_component;

class ProfileFragment : Fragment() {
private val userViewModel: UserViewModel by activityViewModels()

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        userViewModel.user.observe(viewLifecycleOwner, Observer { user ->
        if (user != null) {
        showWelcomeMessage()
        } else {
        navController.navigate(R.id.login_fragment)
        }
        })
        }

private fun showWelcomeMessage() {
        ...
        }
        }
